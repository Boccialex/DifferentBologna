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
public class EatFragment extends Fragment {

    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Set the content of the activity to use the different_bologna_list.xml file
        View rootView = inflater.inflate(R.layout.different_bologna_list, container, false);


        // create an Array List for the Eat Fragment
        final ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item(R.string.vito, R.string.vito_description, R.drawable.ic_vito)); // resource id is of integer type
        items.add(new Item(R.string.babilonia, R.string.babilonia_description, R.drawable.ic_babilonia));
        items.add(new Item(R.string.ruggine, R.string.ruggine_description, R.drawable.ic_ruggine));
        items.add(new Item(R.string.ponte_della_bionda, R.string.ponte_bionda_description, R.drawable.ic_ponte_della_bionda));

        // setting up the array adapter
        ItemAdapter itemsAdapter = new ItemAdapter(getActivity(), items, R.color.eat_fragment);

        // finding the listView and setting the adapter to it
        final ListView listView = rootView.findViewById(R.id.different_bologna_list);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}