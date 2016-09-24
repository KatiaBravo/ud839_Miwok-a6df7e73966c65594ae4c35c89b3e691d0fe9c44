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

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //Get the Default Translation of the word
    public String getmDefaultTranslation() {
        return mMiwokTranslation;
    }

    //Get the Miwok Translation of the word
    public String getmMiwokTranslation() {
        return mDefaultTranslation;
    }
}
