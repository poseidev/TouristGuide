package com.example.android.touristguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

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

                // Save the category selected in the main page
                // Saved category will determine which place list to display in the next activity
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
                Bundle bundle = new Bundle();
                bundle.putInt(getString(R.string.TabLayoutIndex), 3);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }


}
