package com.example.niteshkumar.onlineprepration;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PRACTICfrag extends Fragment {


    public PRACTICfrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_practicfrag,container,false);

        ImageView image2=(ImageView)view.findViewById(R.id.iv2);
        ImageView image3=(ImageView)view.findViewById(R.id.imageView);
        ImageView image4=(ImageView)view.findViewById(R.id.iv1);
        ImageView image5=(ImageView)view.findViewById(R.id.iv3);

        image5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(getActivity(),GK_Activity.class);

                startActivity(i5);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(getActivity(),Mocktest_Activity.class);
                startActivity(i4);
            }
        });


        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getActivity(),Lesson1_Activity.class);
                i3.putExtra("free","Section");
                startActivity(i3);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i2=new Intent(getActivity(),Lesson1_Activity.class);
                i2.putExtra("free","Practice");
                startActivity(i2);

            }
        });
        return view;
    }

}
