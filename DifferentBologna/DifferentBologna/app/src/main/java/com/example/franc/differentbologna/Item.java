package com.example.franc.differentbologna;

public class Item {

    // Titles and descriptions
    private int mTitle;
    private int mDescription;

    // Image resource ids
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mPlayImageResourceId = NO_PLAY_IMAGE_PROVIDED;

    // Audios
    private int mAudioResourceId;
    /**
     * Constant value that represents no image was provided for these items
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_PLAY_IMAGE_PROVIDED = -1;


    // constructor for the new Item ArrayList that includes See, Enjoy and Eat Fragments
    public Item(int Title, int Description, int ImageResourceId) {
        mTitle = Title;
        mDescription = Description;
        mImageResourceId = ImageResourceId;
    }

    // constructor for the new Item ArrayList that includes just the Speak Fragment
    public Item(int Title, int Description, int PlayImageResourceId, int AudioResourceId) {
        mTitle = Title;
        mDescription = Description;
        mPlayImageResourceId = PlayImageResourceId;
        mAudioResourceId = AudioResourceId;
    }

    //get the item title
    public int getTitle() {
        return mTitle;
    }

    //get the item description
    public int getDescription() {
        return mDescription;
    }

    //get the image resource Id
    public int getImageResourceId() {
        return mImageResourceId;
    }

    //get the play image resource Id
    public int getPlayImageResourceId() {
        return mPlayImageResourceId;
    }

    //get the audio resource Id
    public int getAudioResourceId() {
        return mAudioResourceId;
    }

    // check whether image resource id is provided or not
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    // check whether image resource id is provided or not
    public boolean hasImage2() {
        return mPlayImageResourceId != NO_PLAY_IMAGE_PROVIDED;
    }

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }
}