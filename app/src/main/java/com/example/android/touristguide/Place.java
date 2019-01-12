package com.example.android.touristguide;

public class Place {

    private String mName;
    private String mDetails;
    private String mAddress;
    private int mImageResource;

    public Place() { }

    public void setName(String name)
    {
        mName = name;
    }

    public void setDetails(String details)
    {
        mDetails = details;
    }

    public void setAddress(String address)
    {
        mAddress = address;
    }

    public void setImageResource(int imageResource)
    {
        mImageResource = imageResource;
    }

    public String getName()
    {
        return mName;
    }

    public String getDetails()
    {
        return mDetails;
    }

    public String getAddress()
    {
        return mAddress;
    }

    public int getImageResource()
    {
        return mImageResource;
    }
}
