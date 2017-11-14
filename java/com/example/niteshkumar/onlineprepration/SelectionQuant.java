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
public class SelectionQuant extends Fragment {


    public SelectionQuant() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_selection_quant,container,false);



        String[] mobileArr= {" QUANT 01"," QUANT 02", " QUANT 03", " QUANT 04", " QUANT 05", " QUANT 06"};
                ListView listView=(ListView)view.findViewById(R.id.listitem);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArr);


        listView.setAdapter(listviewAdapter);

        return view;
    }

}
