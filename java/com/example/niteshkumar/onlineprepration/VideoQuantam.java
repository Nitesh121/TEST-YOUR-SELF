package com.example.niteshkumar.onlineprepration;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class VideoQuantam extends Fragment {


    public VideoQuantam() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_video_quantam,container,false);
String[] mobileArr= {"NUMBER SYSTEM","PROBABILITY","DIVISIBILITY, HCF & LCM","AVERAGE & ALLIGATIONS","RATIO &PROPORATION","PERCENTAGE,PROFIT & LOSS","SIMPLE & COMPOUND INTEREST","SPEED ,TIME &DISTANCE","WORK,PIPE & CISTERNS"," QUADRATIC EQUATION ", "SIMPLIFICATION","MENSURATION","PERMUTATIONS & COMBINATIONS"};
        ListView listView=(ListView)view.findViewById(R.id.listitem);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArr);


        listView.setAdapter(listviewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mobileArray = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(getActivity(), mobileArray, Toast.LENGTH_LONG).show();

                //String mobileArray= String.valueOf(adapterView.getItemAtPosition(pos));
                Intent intent = new Intent(getActivity(), WebView.class);
                intent.putExtra("url", "video");
                startActivity(intent);
            }


        });
        return view;


    }

}
