package com.example.niteshkumar.onlineprepration;


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
public class SectionEnglish extends Fragment {


    public SectionEnglish() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_section_english, container, false);
        String[] mobileArray = {"ENGLISH 01","ENGLISH 02","ENGLISH 03","ENGLISH 04","ENGLISH 05","ENGLISH 06"};

        ListView listView = (ListView) view.findViewById(R.id.listitem);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray);


        listView.setAdapter(listviewAdapter);
        return view;
    }

}
