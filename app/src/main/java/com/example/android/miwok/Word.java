package com.example.android.miwok;

/**
 * Created by Alfredo on 2/28/2017.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId = NO_IMAGE;
    private static final int NO_IMAGE = -1;


    private int mSoundResourceId;

    public Word (String defaultTranslation, String miwokTranslation, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSoundResourceId = soundResourceId;
    }

    public Word (String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mSoundResourceId = soundResourceId;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    public int getImageResourceId () {
        return mImageResourceId;
    }

    public int getSoundResourceId() {
        return mSoundResourceId;
    }


    public boolean hasImage () {
        return mImageResourceId != NO_IMAGE;
    }
}
