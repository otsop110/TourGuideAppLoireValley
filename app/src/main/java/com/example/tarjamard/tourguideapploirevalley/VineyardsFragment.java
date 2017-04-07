package com.example.tarjamard.tourguideapploirevalley;


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
public class VineyardsFragment extends Fragment {


    public VineyardsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.bourgueil_name, R.string.bourgueil_address));
        locations.add(new Location(R.string.vouvray_name, R.string.vouvray_address));
        locations.add(new Location(R.string.menetousalon_name, R.string.menetousalon_address));
        locations.add(new Location(R.string.pouillyfume_name, R.string.pouillyfume_address));
        locations.add(new Location(R.string.sancerre_name, R.string.sancerre_address));
        locations.add(new Location(R.string.muscadet_name, R.string.muscadet_address));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_vineyards);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;
    }
}