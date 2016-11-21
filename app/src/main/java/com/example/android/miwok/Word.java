package com.example.android.miwok;

import android.content.Context;

import org.w3c.dom.Text;

/**
 * Created by Kids on 9/24/2016.
 */

public class Word {

    /**Default translation for the word*/
    private String mDefaultTranslation;

    /**Miwok translation for the word*/
    private String mMiwokTranslation;

    /**Image resource ID for the word*/
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //Get the Default Translation of the word
    public String getmDefaultTranslation() {
        return mMiwokTranslation;
    }

    //Get the Miwok Translation of the word
    public String getmMiwokTranslation() {
        return mDefaultTranslation;
    }

    //Get the Image Resource id of the image
    public int getmImageResourceId() { return mImageResourceId;}

    //Returns where or not there is an image for this word
    public boolean hasImage() { return mImageResourceId != NO_IMAGE_PROVIDED;}
}
