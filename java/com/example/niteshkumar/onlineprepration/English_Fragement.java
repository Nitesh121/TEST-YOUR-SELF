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
public class English_Fragement extends Fragment {


    public English_Fragement() {
        // Required empty public constructor
    }



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.fragment_english__fragement, container, false);
            String[] mobileArray3 = {"PARAJUMBLES","CRITICAL REASONING","CLOZE TEST","CORRECT USAGE","READIND COMPREHENSION","SENTENCE JOINING","SPEECH AND VOICE","SENTENCE COMPLETION","VOCABULARY"};

            ListView listView = (ListView) view.findViewById(R.id.listitem4);
            ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray3);


            listView.setAdapter(listviewAdapter);
            return view;

    }



}
