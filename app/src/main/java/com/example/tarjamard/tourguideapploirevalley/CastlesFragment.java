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
public class CastlesFragment extends Fragment {


    public CastlesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.location_list, container, false);

        // Create list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.closluce_name, R.string.closluce_address, R.drawable.closluce));
        locations.add(new Location(R.string.chenonceau_name, R.string.chenonceau_address, R.drawable.chenonceau));
        locations.add(new Location(R.string.chambord_name, R.string.chambord_address,R.drawable.chambord));
        locations.add(new Location(R.string.usse_name, R.string.usse_address, R.drawable.usse));
        locations.add(new Location(R.string.azaylerideau_name, R.string.azaylerideau_address, R.drawable.azaylerideau));
        locations.add(new Location(R.string.blois_name, R.string.blois_address, R.drawable.blois));
        locations.add(new Location(R.string.chaumont_name, R.string.chaumont_address, R.drawable.chaumont));
        locations.add(new Location(R.string.amboise_name, R.string.amboise_address, R.drawable.amboise));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations, R.color.category_castles);

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
