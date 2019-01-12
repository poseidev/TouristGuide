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
public class LandmarksFragment extends Fragment {


    public LandmarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        final List<Place> places = new ArrayList();

        places.add(new Place(){{
            setName(getString(R.string.place_landmark_cabildo));
            setAddress(getString(R.string.place_landmark_cabildo_address));
            setDetails(getString(R.string.place_landmark_cabildo_details));
            setImageResource(R.drawable.landmark_cabildo_thumb);
        }});

        places.add(new Place(){{
            setName(getString(R.string.place_landmark_metropolitanCathedral));
            setAddress(getString(R.string.place_landmark_metropolitanCathedral_address));
            setDetails(getString(R.string.place_landmark_metropolitanCathedral_details));
            setImageResource(R.drawable.landmark_catedral_thumb);
        }});

        places.add(new Place(){{
            setName(getString(R.string.place_landmark_jardinBotanico));
            setAddress(getString(R.string.place_landmark_jardinBotanico_address));
            setDetails(getString(R.string.place_landmark_jardinBotanico_details));
            setImageResource(R.drawable.landmark_jardin_botanico_thumb);
        }});

        places.add(new Place(){{
            setName(getString(R.string.place_landmark_palacioLopez));
            setAddress(getString(R.string.place_landmark_palacioLopez_address));
            setDetails(getString(R.string.place_landmark_palacioLopez_details));
            setImageResource(R.drawable.landmark_palacio_gobierno_thumb);
        }});

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView  = rootView.findViewById(R.id.placeListContainer);

        listView.setAdapter(placeAdapter);

        return rootView;
    }

}
