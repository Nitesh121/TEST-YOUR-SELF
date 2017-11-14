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

public class Quant_Fragement extends Fragment {


    public Quant_Fragement() {

            }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quant__fragement, container, false);
        String[] mobileArray = {"NUMBER SYSTEM","LOGRITHMS","DIVISIBILITY,HCF & LCM","AVERAGE & ALLIGATIONS","PERCENTAGE,PROFIT & LOSS",
                "SIMPLE & COMPOUND INTEREST","SPEED ,TIME &DISTANCE","WORK,PIPE & CISTERNS","SIMPLIFICATION","MENSURATION","PERMUTATIONS & COMBINATIONS","PROBABILITY","COMPARISON","CLOCK & CALENDARAS"
    };

        ListView listView = (ListView) view.findViewById(R.id.listitem1);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray);


        listView.setAdapter(listviewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                String mobileArray=String.valueOf(adapterView.getItemAtPosition(pos)) ;
                Toast.makeText(getActivity(),mobileArray,Toast.LENGTH_LONG).show();

                //String mobileArray= String.valueOf(adapterView.getItemAtPosition(pos));
                if(pos==0){
                    Intent intent=new Intent(getActivity(),WebView.class);
                    intent.putExtra("url","hello");
                    startActivity(intent);
                }
                if(pos==1) {
                    Intent intent = new Intent(getActivity(), WebView.class);
                    intent.putExtra("url", "Logrithms");
                    startActivity(intent);
                }
                if(pos==2) {
                    Intent intent = new Intent(getActivity(), WebView.class);
                    intent.putExtra("url", "HCF");
                    startActivity(intent);
                }

                if(pos==3) {
                    Intent intent = new Intent(getActivity(), WebView.class);
                    intent.putExtra("url", "Avg");
                    startActivity(intent);
                }
                if(pos==4) {
                    Intent intent = new Intent(getActivity(), WebView.class);
                    intent.putExtra("url", "Parajumbles");
                    startActivity(intent);
                }



            }
        });
        return view;

    }

}
