package com.example.niteshkumar.onlineprepration;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {

    EditText et[] = new EditText[4];
    int ids[] = {R.id.NAME, R.id.Contact, R.id.Email_id, R.id.password};
    String values[] = new String[et.length];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        for (int j = 0; j < et.length; j++) {
            et[j] = (EditText) findViewById(ids[j]);
        }
    }
    public void login(View v)
    {
        Intent i =new Intent(this,Login.class);
        startActivity(i);
    }


    public void Sign(View v) {
        int j = 0;


        for (j = 0; j < et.length; j++) {
            values[j] = et[j].getText().toString().trim();
            if (values[j].equals("")) {
                et[j].requestFocus();
                et[j].setError("Empty");
                break;
            }

        }

       if (j==et.length ){
            int cont=Integer.parseInt(values[1]);
             MyDatabase mdb = new MyDatabase(this);
            SQLiteDatabase db=mdb.getWritableDatabase();
            String Qry="insert into User_Details values('"+values[0]+"',"+values[1]+",'"+ values[2]+"','"+values[3]+"')";

            db.execSQL(Qry);
            Toast.makeText(this,"user insert",Toast.LENGTH_LONG).show();
            finish();

        }

        }



    }


