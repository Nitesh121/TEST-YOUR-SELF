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
public class Free_Fragement extends Fragment {


    public Free_Fragement() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_free__fragement, container, false);
        String[] mobileArray1 = {"NUMBER SYSTEM", "LOGRITHMS", "TABLE","DIRECTION SENSS","PARAJUMBLES"};
       // String[] mobileArray5 = {"NUMBER SYSTEM","LOGRITHMS","DIVISIBILITY,HCF & LCM","AVERAGE & ALLIGATIONS","RATIO &PROPORATION","PERCENTAGE,PROFIT & LOSS",
                //"SIMPLE & COMPOUND INTEREST","SPEED ,TIME &DISTANCE","WORK,PIPE & CISTERNS","EQUATION & INEQUALITIES","SIMPLIFICATION","MENSURATION","PERMUTATIONS & COMBINATIONS","PROBABILITY","COMPARISON","CLOCK & CALENDARAS"
       // };

        ListView listView = (ListView) view.findViewById(R.id.listitem);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray1);
        //ArrayAdapter<String> listviewAdapter1 = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray5);


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
                    intent.putExtra("url", "hello");
                    startActivity(intent);
                }

                if(pos==3) {
                    Intent intent = new Intent(getActivity(), WebView.class);
                    intent.putExtra("url", "Dir");
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