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
public class PracticeQuant extends Fragment {


    public PracticeQuant() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_video_quantam,container,false);
        String[] mobileArr= {"NUMBER SYSTEM","PROBABILITY","DIVISIBILITY, HCF & LCM","AVERAGE & ALLIGATIONS","RATIO &PROPORATION","PERCENTAGE,PROFIT & LOSS","SIMPLE & COMPOUND INTEREST","SPEED ,TIME &DISTANCE","WORK,PIPE & CISTERNS"," QUADRATIC EQUATION ", "SIMPLIFICATION","MENSURATION","PERMUTATIONS & COMBINATIONS"};

        ListView listView=(ListView)view.findViewById(R.id.listitem);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArr);


        listView.setAdapter(listviewAdapter);
        return view;
    }

}
