package com.example.android.touristguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {


    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        List<Place> places = new ArrayList<>();

        places.add(new Place() {{
            setName(getString(R.string.place_restaurant_barSanRoque));
            setDetails(getString(R.string.place_restaurant_barSanRoque_details));
            setAddress(getString(R.string.place_restaurant_barSanRoque_address));
            setImageResource(R.drawable.restaurant_bar_san_roque_thumb);
        }});

        places.add(new Place() {{
            setName(getString(R.string.place_restaurant_confiteriaBolsi));
            setDetails(getString(R.string.place_restaurant_confiteriaBolsi_details));
            setAddress(getString(R.string.place_restaurant_confiteriaBolsi_address));
            setImageResource(R.drawable.restaurant_confiteria_bolsi_thumb);
        }});

        places.add(new Place() {{
            setName(getString(R.string.place_restaurant_lidoBar));
            setDetails(getString(R.string.place_restaurant_lidoBar_details));
            setAddress(getString(R.string.place_restaurant_lidoBar_address));
            setImageResource(R.drawable.restaurant_lido_bar_thumb);
        }});

        places.add(new Place() {{
            setName(getString(R.string.place_restaurant_paulistaGrill));
            setDetails(getString(R.string.place_restaurant_paulistaGrill_details));
            setAddress(getString(R.string.place_restaurant_paulistaGrill_address));
            setImageResource(R.drawable.restaurant_paulista_grill_thumb);
        }});

        ListView listView = rootView.findViewById(R.id.placeListContainer);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
