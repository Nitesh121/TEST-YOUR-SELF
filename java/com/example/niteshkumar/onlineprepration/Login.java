package com.example.niteshkumar.onlineprepration;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText et1,et2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        et1=(EditText)findViewById(R.id.USER_NAME);
        et2=(EditText)findViewById(R.id.pass);
        b=(Button)findViewById(R.id.Login);

    }


    public void UserValidate(View v) {
        String User = et1.getText().toString();
        String password = et2.getText().toString();

        MyDatabase db = new MyDatabase(this);
        SQLiteDatabase sqLiteDatabase=db.getWritableDatabase();
       String Qry="select name from User_Details where email='"+User+ "' and pass='"+password+"'";
       Cursor c=sqLiteDatabase.rawQuery(Qry,null);
        boolean res=c.moveToFirst();

        if (res)
       {
           String name= c.getString(0);


           Toast.makeText(this,"welcome page"+name,Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(this,CourceDetailfrag.class) ;
                startActivity(intent);



        }else
        {
            Toast.makeText(this,"invalid",Toast.LENGTH_SHORT).show();
        }


    }
}

