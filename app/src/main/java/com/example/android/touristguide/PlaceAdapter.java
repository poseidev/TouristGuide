package com.example.android.touristguide;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

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

        final ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentPlace.getImageResource());

        final Integer imageResourceIdFull = currentPlace.getImageResourceFull();

        final Context context = getContext();

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                setImageDialog(imageResourceIdFull, context);
            }
        });

        return listItemView;
    }

    private void setImageDialog(Integer imageResourceId, Context context) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.image, null);

        final Dialog dialog = new Dialog(context);

        ImageView imageView = view.findViewById(R.id.imageView);

        imageView.setImageResource(imageResourceId);

        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        dialog.setContentView(view);

        ImageButton button = dialog.findViewById(R.id.closeButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}