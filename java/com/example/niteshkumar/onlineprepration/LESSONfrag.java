package com.example.niteshkumar.onlineprepration;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import java.util.List;

public class LESSONfrag extends Fragment {


    public LESSONfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lessonfrag, container, false);
        ImageView image = (ImageView) view.findViewById(R.id.imageView2);
        ImageView image1=(ImageView)view.findViewById(R.id.imageView3);

        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getActivity(),Lesson1_Activity.class);
                i1.putExtra("free","Video");
                startActivity(i1);

            }
        });


        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), Lesson1_Activity.class);
                i.putExtra("free","Lesson");
                startActivity(i);


                //Toast.makeText(v.getContext().getApplicationContext(),"click",Toast.LENGTH_LONG).show();

            }
        });
        return view;
    }


}



