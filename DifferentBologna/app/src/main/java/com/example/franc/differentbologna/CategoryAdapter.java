package com.example.franc.differentbologna;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class CategoryAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[]{"See", "Enjoy", "Eat", "Speak"};

    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        if (position == 0) {
            return new SeeFragment();
        } else if (position == 1) {
            return new EnjoyFragment();
        } else if (position == 2) {
            return new EatFragment();
        } else {
            return new SpeakFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}