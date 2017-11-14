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
public class SSC_Fragment extends Fragment {


    public SSC_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_ssc_, container, false);
        String[] mobileArray5 = {"SSC CGL 1","SSC CGL 2","SSC CGL 3","SSC CGL 4","SSC CGL 5","SSC CGL 6","SSC CGL 7","SSC CGL 8","SSC CGL 9","SSC CGL 10" };

        ListView listView = (ListView) view.findViewById(R.id.listitem5);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray5);


        listView.setAdapter(listviewAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String mobileArray = String.valueOf(adapterView.getItemAtPosition(i));
                Toast.makeText(getActivity(), mobileArray, Toast.LENGTH_LONG).show();

                //String mobileArray= String.valueOf(adapterView.getItemAtPosition(pos));
                Intent intent = new Intent(getActivity(), WebView.class);
                intent.putExtra("url", "cgl");
                startActivity(intent);
            }


        });
        return view;

    }

}
