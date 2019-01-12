package com.example.android.touristguide;

import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class CategoryDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set up "Up" button in the action bar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        setContentView(R.layout.activity_cateogry_details);

        // Initialize ViewPager
        ViewPager viewPager = findViewById(R.id.viewPager);

        PagerAdapter pagerAdapter = new CategoryAdapter(this, getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);

        // Initialize Tab Layout
        TabLayout tabLayout = findViewById(R.id.tabLayout);

        tabLayout.setupWithViewPager(viewPager);


        Bundle bundle = getIntent().getExtras();
        Integer tabIndex = bundle.getInt(getString(R.string.TabLayoutIndex));

        viewPager.setCurrentItem(tabIndex, false);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
