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
public class DENA_PO_Fragement extends Fragment {


    public DENA_PO_Fragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dena__po__fragement, container, false);
        String[] mobileArray8 = {"DENA PO 1", "DENA PO 2", "DENA PO 3", "DENA PO 4", "DENA PO 5", };

        ListView listView = (ListView) view.findViewById(R.id.listitem8);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray8);


        listView.setAdapter(listviewAdapter);
        return view;
    }

}
