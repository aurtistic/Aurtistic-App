package com.example.aurtisticproject.HelperClasses.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aurtisticproject.HelperClasses.HomeAdapter.MostViewedHelperClass;
import com.example.aurtisticproject.R;

import java.util.ArrayList;

public class MostViewedAdapter extends RecyclerView.Adapter<MostViewedAdapter.MostViewedViewHolder> {

    ArrayList<MostViewedHelperClass> mostViewedLocations;

    public MostViewedAdapter(ArrayList<MostViewedHelperClass> mostViewedLocations) {
        this.mostViewedLocations = mostViewedLocations;
    }

    @NonNull
    @Override
    public MostViewedViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.most_viewed_card_design, parent, false);
        MostViewedViewHolder mostViewedViewHolder = new MostViewedViewHolder(view);
        return mostViewedViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MostViewedViewHolder holder, int position) {
        MostViewedHelperClass helperClass = mostViewedLocations.get(position);

//        holder.image.setImageResource(helperClass.getImage());
        holder.textView.setText(helperClass.getTitle());
        holder.designation.setText(helperClass.getDesignation());
        holder.desc.setText(helperClass.getDescription());
    }

    @Override
    public int getItemCount() {
        return mostViewedLocations.size();
    }

    public static class MostViewedViewHolder extends RecyclerView.ViewHolder {

//        ImageView image;
        TextView textView, desc, designation;

        public MostViewedViewHolder(@NonNull View itemView) {
            super(itemView);

//            image = itemView.findViewById(R.id.mv_image);
            textView = itemView.findViewById(R.id.ms_title);
            desc = itemView.findViewById(R.id.mv_desc);
            designation = itemView.findViewById(R.id.designation);
        }
    }
}
