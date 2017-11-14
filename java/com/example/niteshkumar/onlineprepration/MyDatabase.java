package com.example.niteshkumar.onlineprepration;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by nitesh kumar on 8/25/2017.
 */

public class MyDatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="db_details";
    Context context;

      public MyDatabase(Context context){
          super(context,DATABASE_NAME,null,1);
          this.context = context;
      }





    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String Qry = "create table User_Details(name text,contact text ,email text,pass text)";
        sqLiteDatabase.execSQL(Qry);
        Toast.makeText(context,"table created",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
