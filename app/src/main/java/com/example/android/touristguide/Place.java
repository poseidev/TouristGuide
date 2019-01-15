package com.example.android.touristguide;

public class Place {

    private String mName;
    private String mDetails;
    private String mAddress;
    private int mImageResource;
    private int mImageResourceFull;

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

    public void setImageResourceFull(int imageResourceFull)
    {
        mImageResourceFull = imageResourceFull;
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

    public int getImageResourceFull()
    {
        return mImageResourceFull;
    }
}
