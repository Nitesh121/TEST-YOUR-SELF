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
public class VideoEnglish extends Fragment {


    public VideoEnglish() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video_english, container, false);
        String[] mobileArray = {"PARAJUMBLES","CRITICAL REASONING","CLOZE TEST","CORRECT USAGE","READIND COMPREHENSION","SENTENCE JOINING","SPEECH AND VOICE","SENTENCE COMPLETION","VOCABULARY"};

        ListView listView = (ListView) view.findViewById(R.id.listitem);
        ArrayAdapter<String> listviewAdapter = new ArrayAdapter<String>(getActivity(), R.layout.listview, mobileArray);


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
