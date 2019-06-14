package com.example.android.touristguide;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        LinearLayout landmarksLayout = findViewById(R.id.landmarksCategory);
        LinearLayout museumsLayout = findViewById(R.id.museumsCategory);
        LinearLayout restaurantsLayout = findViewById(R.id.restaurantsCategory);
        LinearLayout shoppingLayout = findViewById(R.id.shoppingCategory);

        landmarksLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CategoryDetailsActivity.class);

                // Save tab page number of Landmarks
                // This will set Landmarks as the default selected tab page
                Bundle bundle = new Bundle();
                bundle.putInt(getString(R.string.TabLayoutIndex), 0);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });

        museumsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CategoryDetailsActivity.class);

                // Save tab page number of Museums
                // This will set Museums as the default selected tab page
                Bundle bundle = new Bundle();
                bundle.putInt(getString(R.string.TabLayoutIndex), 1);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        restaurantsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CategoryDetailsActivity.class);

                // Save tab page number of Restaurants
                // This will set Restaurants as the default selected tab page
                Bundle bundle = new Bundle();
                bundle.putInt(getString(R.string.TabLayoutIndex), 2);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        shoppingLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CategoryDetailsActivity.class);

                // Save tab page number of Shopping category
                // This will set Shopping category as the default selected tab page
                Bundle bundle = new Bundle();
                bundle.putInt(getString(R.string.TabLayoutIndex), 3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        ActionBar actionBar =  getSupportActionBar();

        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);

        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT
        );

        View view = LayoutInflater.from(this).inflate(R.layout.actionbar_main, null);

        actionBar.setCustomView(view, layoutParams);
    }
}
