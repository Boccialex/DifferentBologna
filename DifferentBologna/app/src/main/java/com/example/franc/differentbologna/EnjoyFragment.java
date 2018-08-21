package com.example.franc.differentbologna;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EnjoyFragment extends Fragment {

    public EnjoyFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Set the content of the activity to use the different_bologna_list.xml file
        View rootView = inflater.inflate(R.layout.different_bologna_list, container, false);


        // create an Array List for the Enjoy Fragment
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.covo_club, R.string.covo_cluc_description, R.drawable.ic_covo_club));  // resource id is of integer type
        items.add(new Item(R.string.cassero, R.string.cassero_description, R.drawable.ic_cassero));
        items.add(new Item(R.string.camera_a_sud, R.string.camera_description, R.drawable.ic_camera_a_sud));
        items.add(new Item(R.string.osteria_del_sole, R.string.osteria_sole_description, R.drawable.ic_osteria_sole));

        // setting up the array adapter
        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), items, R.color.enjoy_fragment);

        // finding the listView and setting the adapter to it
        final ListView listView = rootView.findViewById(R.id.different_bologna_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}