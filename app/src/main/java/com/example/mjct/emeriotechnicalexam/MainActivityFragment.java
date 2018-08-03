package com.example.mjct.emeriotechnicalexam;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment {


    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main_activity, container, false);

        String[] weatherListstr = {"Current Loc", "London", "Prague", "San Francisco"};

        ListView weatherList = view.findViewById(R.id.listViewContainer);

        ArrayAdapter<String> weatherListAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,
                weatherListstr);

        weatherList.setAdapter(weatherListAdapter);

        return view;
    }

}
