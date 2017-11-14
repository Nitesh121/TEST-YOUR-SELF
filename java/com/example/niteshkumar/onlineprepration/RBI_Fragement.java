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
public class RBI_Fragement extends Fragment {


    public RBI_Fragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_rbi__fragement,container,false);
        String[] mobileArray6 = {"RBI 1","RBI 2","RBI 3","RBI 5","RBI 6","RBI 7","RBI 8","RBI 9","RBI 10"};

        ListView listView = (ListView) view.findViewById(R.id.listitem6);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray6);


        listView.setAdapter(listviewAdapter);
        return view;


    }

}
