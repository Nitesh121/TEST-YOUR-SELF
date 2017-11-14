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
public class BOB_fragement extends Fragment {


    public BOB_fragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_bob_fragement,container,false);
        String[] mobileArray7 = {"BOB 1","BOB 2","BOB 3","BOB 4","BOB 5",};

        ListView listView = (ListView) view.findViewById(R.id.listitem7);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray7);


        listView.setAdapter(listviewAdapter);
        return view;

    }

}
