package com.example.android.touristguide;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private DialogInterface.OnClickListener dialogInterfaceOnClickListener = new DialogInterface.OnClickListener() {
        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    };

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
        AlertDialog.Builder builder = new AlertDialog.Builder(context);

        builder.setNegativeButton(R.string.label_close, dialogInterfaceOnClickListener);

        final AlertDialog dialog = builder.create();

        final Integer negativeButtonTextColor = context.getResources().getColor(R.color.colorWhite);

        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface dialogInterface) {
                dialog.getButton(AlertDialog.BUTTON_NEGATIVE).setTextColor(negativeButtonTextColor);
            }
        });

        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.image, null);

        ImageView imageView = view.findViewById(R.id.imageView);
        imageView.setImageResource(imageResourceId);

        dialog.setView(view);

        dialog.show();

        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
    }
}