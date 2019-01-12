package com.example.android.touristguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Context context, List<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.place_list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeName = listItemView.findViewById(R.id.nameTextView);
        placeName.setText(currentPlace.getName());

        TextView details = listItemView.findViewById(R.id.detailsTextView);
        details.setText(currentPlace.getDetails());

        TextView address = listItemView.findViewById(R.id.addressTextView);
        address.setText(currentPlace.getAddress());

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResource());

        return listItemView;
    }
}