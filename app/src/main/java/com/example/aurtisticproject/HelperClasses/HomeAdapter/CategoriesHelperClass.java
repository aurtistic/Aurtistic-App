package com.example.aurtisticproject.HelperClasses.HomeAdapter;

import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass {

    int image;
    String  title;
    GradientDrawable gradient;

    public CategoriesHelperClass(GradientDrawable gradient, int image, String description) {
        this.image = image;
//        this.title = title;
        this.title = description;
        this.gradient = gradient;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

//    public String getDescription() {
//        return description;
//    }

    public GradientDrawable getGradient() {
        return gradient;
    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

    public void setGradient(GradientDrawable gradient) {
        this.gradient = gradient;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
