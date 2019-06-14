package com.example.android.touristguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageButton;

public class CategoryDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set up "Up" button in the action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(false);
        actionBar.setDisplayShowTitleEnabled(false);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowCustomEnabled(true);

        ActionBar.LayoutParams layoutParams = new ActionBar.LayoutParams(
                ActionBar.LayoutParams.MATCH_PARENT,
                ActionBar.LayoutParams.MATCH_PARENT
        );

        View view = LayoutInflater.from(this).inflate(R.layout.actionbar_categories, null);

        ImageButton homeButton = view.findViewById(R.id.homeButton);

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavUtils.navigateUpFromSameTask(CategoryDetailsActivity.this);
            }
        });

        actionBar.setCustomView(view, layoutParams);

        setContentView(R.layout.activity_category_details);

        // Initialize ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);

        PagerAdapter pagerAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        // Initialize Tab Layout
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(viewPager);

        // Get the selected category (tab index) from the main activity and
        // displays the place list based on the said category
        Bundle bundle = getIntent().getExtras();
        Integer tabIndex = bundle.getInt(getString(R.string.TabLayoutIndex));

        viewPager.setCurrentItem(tabIndex, false);
    }
}
