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
public class Reasoning_Fragement extends Fragment {


    public Reasoning_Fragement() {
        // Required empty public constructor
    }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_reasoning__fragement, container, false);
            String[] mobileArray2 = {"DIRECTION SENSE","VISUAL REASONING","ANALYTICAL REASONING","BLOOD RELATIONS","CODING DECODING","INPUT OUTPUT","PUZZLES","SYLLOGISM" };

            ListView listView = (ListView) view.findViewById(R.id.listitem2);
            ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray2);


            listView.setAdapter(listviewAdapter);
            return view;

    }

}
