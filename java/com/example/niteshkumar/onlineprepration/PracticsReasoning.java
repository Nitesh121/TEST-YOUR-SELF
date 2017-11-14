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
public class PracticsReasoning extends Fragment {


    public PracticsReasoning() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_practics_reasoning,container,false);
        String[] mobile={"DIRECTION SENSE","VISUAL REASONING","ANALYTICAL REASONING","BLOOD RELATIONS","INPUT OUTPUT","PUZZLES","SYLLOGISM" };
        ListView listView = (ListView) view.findViewById(R.id.listitem);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobile);


        listView.setAdapter(listviewAdapter);

        return  view;
    }

}
