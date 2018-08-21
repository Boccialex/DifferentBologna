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
public class SeeFragment extends Fragment {

    public SeeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Set the content of the activity to use the different_bologna_list.xml file
        View rootView = inflater.inflate(R.layout.different_bologna_list, container, false);

        // create an Array List for the See Fragment
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.asinelli_tower, R.string.asinelli_description, R.drawable.ic_asinelli_tower));  // resource id is of integer type
        items.add(new Item(R.string.san_luca_portics, R.string.san_luca_description, R.drawable.ic_portics_sanluca));
        items.add(new Item(R.string.cycling_tour_navile, R.string.cycling_description, R.drawable.ic_navile_cycling_tour));
        items.add(new Item(R.string.underground_bologna, R.string.underground_description, R.drawable.ic_underground_bologna));

        // setting up the array adapter
        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), items, R.color.see_fragment);

        // finding the listView and setting the adapter to it
        final ListView listView = rootView.findViewById(R.id.different_bologna_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}