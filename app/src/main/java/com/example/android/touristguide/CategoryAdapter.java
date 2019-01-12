package com.example.android.touristguide;


import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fm)
    {
        super(fm);

        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;

        switch(position)
        {
            case 0:
                fragment = new LandmarksFragment();
                break;

            case 1:
                fragment = new MuseumsFragment();
                break;

            case 2:
                fragment = new RestaurantsFragment();
                break;

            case 3:
                fragment = new ShoppingFragment();
                break;

            default:
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = null;

        switch(position)
        {
            case 0:
                title = mContext.getString(R.string.category_Landmarks);
                break;

            case 1:
                title = mContext.getString(R.string.category_Museums);
                break;

            case 2:
                title = mContext.getString(R.string.category_Restaurants);
                break;

            case 3:
                title = mContext.getString(R.string.category_Shopping);
                break;

            default:
                break;
        }

        return title;
    }
}
