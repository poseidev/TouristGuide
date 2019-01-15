package com.example.android.touristguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final List<Place> places = new ArrayList<>();

        places.add(new Place(){{
            setName(getString(R.string.place_museum_estacionFerrocarril));
            setDetails(getString(R.string.place_museum_estacionFerrocarril_details));
            setAddress(getString(R.string.place_museum_estacionFerrocarril_address));
            setImageResource(R.drawable.museum_estacion_thumb);
            setImageResourceFull(R.drawable.museum_estacion_full);
        }});

        places.add(new Place(){{
            setName(getString(R.string.place_museum_museoDelBarro));
            setDetails(getString(R.string.place_museum_museoDelBarro_details));
            setAddress(getString(R.string.place_museum_museoDelBarro_address));
            setImageResource(R.drawable.museum_del_barro_thumb);
            setImageResourceFull(R.drawable.museum_del_barro_full);
        }});

        places.add(new Place(){{
            setName(getString(R.string.place_museum_museoBarbero));
            setDetails(getString(R.string.place_museum_museoBarbero_details));
            setAddress(getString(R.string.place_museum_museoBarbero_address));
            setImageResource(R.drawable.museum_barbero_thumb);
            setImageResourceFull(R.drawable.museum_barbero_full);
        }});

        places.add(new Place(){{
            setName(getString(R.string.place_museum_fineArts));
            setDetails(getString(R.string.place_museum_fineArts_details));
            setAddress(getString(R.string.place_museum_fineArts_address));
            setImageResource(R.drawable.museum_fine_arts_thumb);
            setImageResourceFull(R.drawable.museum_fine_arts_full);
        }});


        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.placeListContainer);

        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
