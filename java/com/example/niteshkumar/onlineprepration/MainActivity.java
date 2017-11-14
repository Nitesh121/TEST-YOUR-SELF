package com.example.niteshkumar.onlineprepration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater mi= getMenuInflater();
        mi.inflate(R.menu.example,menu);
        return  true;
    }

    public void goToLogin(MenuItem item){
        Intent intent=new Intent(this,Login.class);
        startActivity(intent);
    }
    public void hom(MenuItem item){
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void cour(MenuItem item){
        Intent intent=new Intent(this,CourceDetailfrag.class);
        startActivity(intent);
    }


    public void sign(MenuItem item){
        Intent intent=new Intent(this,SignIn.class);
        startActivity(intent);
    }

    public void Start (View v)
    {
        Intent i=new Intent(MainActivity.this,SignIn.class);
        startActivity(i);
    }
    public void Log (View v)
    {
        Intent i=new Intent(MainActivity.this,Login.class);
        startActivity(i);
    }
}
