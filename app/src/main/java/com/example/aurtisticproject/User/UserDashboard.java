
package com.example.aurtisticproject.User;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.ClipData;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.aurtisticproject.Admin.Work_for_Aurtistic;
import com.example.aurtisticproject.Common.LoginSignup.StartUpScreen;
import com.example.aurtisticproject.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.example.aurtisticproject.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.example.aurtisticproject.R;

import java.util.ArrayList;

import com.example.aurtisticproject.HelperClasses.HomeAdapter.FeaturedAdapter;
import com.example.aurtisticproject.HelperClasses.HomeAdapter.FeaturedHelperClass;
import com.example.aurtisticproject.HelperClasses.HomeAdapter.MostViewedAdapter;
import com.example.aurtisticproject.HelperClasses.HomeAdapter.MostViewedHelperClass;
import com.example.aurtisticproject.HelperClasses.HomeAdapter.CategoriesAdapter;
import com.example.aurtisticproject.HelperClasses.HomeAdapter.CategoriesHelperClass;
import com.google.android.material.navigation.NavigationView;

public class UserDashboard extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    //Variables
    static final float END_SCALE = 0.7F;
    RecyclerView featuredRecycler, mostViewedRecycler, categoriesRecycler;
    RecyclerView.Adapter adapter;
    private GradientDrawable gradient1, gradient2, gradient3, gradient4;
    ImageView menuIcon;
    LinearLayout contentView;


    //Drawer Menu

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_user_dashboard);

        //Hooks
        featuredRecycler = findViewById(R.id.featured_recycler);
        mostViewedRecycler = findViewById(R.id.most_viewed_recycler);
        categoriesRecycler = findViewById(R.id.categories_recycler);
        menuIcon = findViewById(R.id.menu_icon);
        contentView = findViewById(R.id.content);

        //Menu Hooks

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.navigation_view);


        navigationDrawer();

        //Functions will be executed automatically when this activity will be created
        featuredRecycler();
        mostViewedRecycler();
        categoriesRecycler();

    }

    //Navigation Drawer Functions

    private void navigationDrawer() {

        navigationView.bringToFront();
        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        menuIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (drawerLayout.isDrawerVisible(GravityCompat.START))
                    drawerLayout.closeDrawer(GravityCompat.START);

                else drawerLayout.openDrawer(GravityCompat.START);

            }
        });

        animateNavigationDrawer();
    }

    private void animateNavigationDrawer() {

        drawerLayout.setScrimColor(getResources().getColor(R.color.sky));

        drawerLayout.addDrawerListener(new DrawerLayout.SimpleDrawerListener() {
            @Override
            public void onDrawerSlide(View drawerView, float slideOffset) {

                // Scale the View based on current slide offset
                final float diffScaledOffset = slideOffset * (1 - END_SCALE);
                final float offsetScale = 1 - diffScaledOffset;
                contentView.setScaleX(offsetScale);
                contentView.setScaleY(offsetScale);

                // Translate the View, accounting for the scaled width
                final float xOffset = drawerView.getWidth() * slideOffset;
                final float xOffsetDiff = contentView.getWidth() * diffScaledOffset / 2;
                final float xTranslation = xOffset - xOffsetDiff;
                contentView.setTranslationX(xTranslation);
            }

        });
    }

    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerVisible(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else

            super.onBackPressed();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.nav_all_categories:
                startActivity(new Intent(getApplicationContext(), AllCategories.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.nav_home:
                startActivity(new Intent(getApplicationContext(), UserDashboard.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.login:
                startActivity(new Intent(getApplicationContext(), Login.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.profile:
                startActivity(new Intent(getApplicationContext(), UserProfile.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.section_1:
                startActivity(new Intent(getApplicationContext(), Section_1.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.section_2:
                startActivity(new Intent(getApplicationContext(), Section_2.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.section_3:
                startActivity(new Intent(getApplicationContext(), Section_3.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.section_4:
                startActivity(new Intent(getApplicationContext(), Section_4.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.section_5:
                startActivity(new Intent(getApplicationContext(), Section_5.class));
                break;
        }

        switch (item.getItemId()) {
            case R.id.section_6:
                startActivity(new Intent(getApplicationContext(), Section_6.class));
                break;
        }

        return true;
    }

    //Recycler View Functions

    private void categoriesRecycler() {

        //All Gradients
        gradient2 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffd4cbe5, 0xffd4cbe5});
        gradient1 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xff7adccf, 0xff7adccf});
        gradient3 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xfff7c59f, 0xFFf7c59f});
        gradient4 = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0xffb8d7f5, 0xffb8d7f5});


        ArrayList<CategoriesHelperClass> categoriesHelperClasses = new ArrayList<>();
        categoriesHelperClasses.add(new CategoriesHelperClass(gradient2, R.drawable.know_more_design_updated, "What is ASD?"));
        categoriesHelperClasses.add(new CategoriesHelperClass(gradient1, R.drawable.beautiful, "Autism is beautiful"));
        categoriesHelperClasses.add(new CategoriesHelperClass(gradient3, R.drawable.efforts, "Efforts of Aurtistic"));
//        categoriesHelperClasses.add(new CategoriesHelperClass(gradient4, R.drawable.stories_updated, "Aurtistic Stories"));
//        categoriesHelperClasses.add(new CategoriesHelperClass(gradient1, R.drawable.study, "Study Time"));
//        categoriesHelperClasses.add(new CategoriesHelperClass(gradient2, R.drawable.quiz_updated, "Quiz Time"));


        categoriesRecycler.setHasFixedSize(true);
        adapter = new CategoriesAdapter(categoriesHelperClasses);
        categoriesRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
        categoriesRecycler.setAdapter(adapter);

    }

    private void mostViewedRecycler() {

        mostViewedRecycler.setHasFixedSize(true);
        mostViewedRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<MostViewedHelperClass> mostViewedLocations = new ArrayList<>();
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.bhavana_mam, "Ms. Bhavana Kaushik", "(Mentor, Aurtistic)" ,"Working with Team Aurtistic as a mentor is an honour for me. Team grouped up together quickly and collected the authentic data from various NGOs and counselors who deals with Autistic people.  Application is designed in very user-friendly manner keeping in mind the capabilities of person with ASD and will open the doors for people associated with ASD child and adult as a parents and caretakers. This is surely a great initiative and my best wishes are with the Team Aurtistic." ));
        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.karma_maam, "Karma Lhamo Dulal", "(Journalism Student, UN Volunteer)","One significant element that I’ve observed in Team Aurtistic is Empathy. The emotion isn’t very a fancy one and doesn’t reside in all. But, I’m delighted that a group of young talented boys have come forward to celebrate diversity and equality in the form of developing an app for the autistic people. However, these young talents have sorted a perfect solution by reaping the benefit of multimedia. The perseverance will decided a long way and for that journey I wish them the best of luck. \n\n" +
                "Best, Karma"));
//        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.city_1, "J."));
//        mostViewedLocations.add(new MostViewedHelperClass(R.drawable.mcdonald_img, "Walmart"));

        adapter = new MostViewedAdapter(mostViewedLocations);
        mostViewedRecycler.setAdapter(adapter);

    }

    private void featuredRecycler() {

        featuredRecycler.setHasFixedSize(true);
        featuredRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<FeaturedHelperClass> featuredLocations = new ArrayList<>();

        featuredLocations.add(new FeaturedHelperClass(R.drawable.aurtistic_startup_logo, "Aurtistic", "Hi there! We are Team Aurtistic at your service."));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.aurtistic_stories, "Aurtistic Stories", "Share your stories with us on our website. We are happy to hear!"));
        featuredLocations.add(new FeaturedHelperClass(R.drawable.website_icon, "Our Website", "Come visit our website (www.aurtisticservices.com) and know more about us"));

        adapter = new FeaturedAdapter(featuredLocations);
        featuredRecycler.setAdapter(adapter);


    }

    //Calls

    public void callLogin(View view){
        startActivity(new Intent(getApplicationContext(), Login.class));
    }

    public void callSection_1(View view){
        startActivity(new Intent(getApplicationContext(), Section_1.class));
    }

    public void callSection_2(View view){
        startActivity(new Intent(getApplicationContext(), Section_2.class));
    }

    public void callSection_3(View view){
        startActivity(new Intent(getApplicationContext(), Section_3.class));
    }

    public void callSection_4(View view){
        startActivity(new Intent(getApplicationContext(), Section_4.class));
    }

    public void callWork_for_Aurtistic(View view){
        startActivity(new Intent(getApplicationContext(), Work_for_Aurtistic.class));
    }

    public void call_all_cat(View view){
        startActivity(new Intent(getApplicationContext(), AllCategories.class));
    }

    public void call_help_yourself(View view){
        startActivity(new Intent(getApplicationContext(), HelpYourself.class));
    }


}