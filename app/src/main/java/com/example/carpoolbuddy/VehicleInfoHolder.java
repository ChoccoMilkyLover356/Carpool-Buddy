package com.example.carpoolbuddy;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.carpoolbuddy.R;

public class VehicleInfoHolder extends RecyclerView.ViewHolder{


        protected TextView idText;
        protected TextView typeText;
        protected TextView nameText;
        protected TextView priceText;
        protected TextView descriptionText;

    public VehicleInfoHolder(@NonNull View itemview)
        {
            super(itemview);
            //typeText = itemview.findViewById(R.id.typeTextView);

        }
    }