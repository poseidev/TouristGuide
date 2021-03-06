package com.example.android.touristguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

public class ShoppingFragment extends Fragment {

    public ShoppingFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.place_list, container, false);

        List<Place> places = new ArrayList<>();

        places.add(new Place() {{
            setName(getString(R.string.place_shopping_mariscalLopez));
            setDetails(getString(R.string.place_shopping_mariscalLopez_details));
            setAddress(getString(R.string.place_shopping_mariscalLopez_address));
            setImageResource(R.drawable.shopping_mariscal_lopez_thumb);
            setImageResourceFull(R.drawable.shopping_mariscal_lopez_full);
        }});

        places.add(new Place() {{
            setName(getString(R.string.place_shopping_paseoCarmelitas));
            setDetails(getString(R.string.place_shopping_paseoCarmelitas_details));
            setAddress(getString(R.string.place_shopping_paseoCarmelitas_address));
            setImageResource(R.drawable.shopping_paseo_carmelitas_thumb);
            setImageResourceFull(R.drawable.shopping_paseo_carmelitas_full);
        }});

        places.add(new Place() {{
            setName(getString(R.string.place_shopping_shoppingDelSol));
            setDetails(getString(R.string.place_shopping_shoppingDelSol_details));
            setAddress(getString(R.string.place_shopping_shoppingDelSol_address));
            setImageResource(R.drawable.shopping_del_sol_thumb);
            setImageResourceFull(R.drawable.shopping_del_sol_full);
        }});

        places.add(new Place() {{
            setName(getString(R.string.place_shopping_paseoLaGaleria));
            setDetails(getString(R.string.place_shopping_paseoLaGaleria_details));
            setAddress(getString(R.string.place_shopping_paseoLaGaleria_address));
            setImageResource(R.drawable.shopping_paseo_la_galeria_thumb);
            setImageResourceFull(R.drawable.shopping_paseo_la_galeria_full);
        }});

        ListView listView = rootView.findViewById(R.id.placeListContainer);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
