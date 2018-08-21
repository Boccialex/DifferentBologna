package com.example.franc.differentbologna;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class ItemAdapter extends ArrayAdapter<Item> {

    //Resource id for background color of list
    private int mColorResourceId;

    public ItemAdapter(Activity context, ArrayList<Item> items, int colorResourceId) {
        super(context, 0, items);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // check if the current view is reused else inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //get the object located at position
        Item word_item = getItem(position);

        //find the textview in list_item with id default_text_view
        TextView TitleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        //gets the default Translation and set it to the text of this textView
        TitleTextView.setText(word_item.getTitle());

        //find the textview in list_item with id miwok_text_view
        TextView DescriptionTextView = (TextView) listItemView.findViewById(R.id.description_text_view);
        //gets the miwok Translation and set it to the text of this textView
        DescriptionTextView.setText(word_item.getDescription());

        //find the image view with id image
        ImageView mPlayImageView = (ImageView) listItemView.findViewById(R.id.play_icon);
        if (word_item.hasImage2()) {

            //get the imageResource get and set it as source of the image view
            mPlayImageView.setImageResource(word_item.getPlayImageResourceId());

            //make the image view visible
            mPlayImageView.setVisibility(View.VISIBLE);
        } else {
            mPlayImageView.setVisibility(View.GONE);
        }

        //find the image view with id image
        ImageView mImageView = (ImageView) listItemView.findViewById(R.id.image);
        if (word_item.hasImage()) {

            //get the imageResource get and set it as source of the image view
            mImageView.setImageResource(word_item.getImageResourceId());

            //make the image view visible
            mImageView.setVisibility(View.VISIBLE);
        } else {
            mImageView.setVisibility(View.GONE);
        }


        //search for the view with the given id
        View textContainer = listItemView.findViewById(R.id.text_container);

        // get the proper color for each context
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        // set its background resource to the mColorResourceId
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}