package com.example.linux.sqlite;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);


        final Button btn1 = (Button) findViewById(R.id.button1);

        myDBClass myDb = new myDBClass(this);

        myDb.getWritableDatabase(); // First method



        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open Form Add
                Intent newActivity = new Intent(MainActivity.this, AddActivity.class);
                startActivity(newActivity);

            }
        });



        // Button2 (Show)
        final Button btn2 = (Button) findViewById(R.id.button2);
        // Perform action on click
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open Form Show
                Intent newActivity = new Intent(MainActivity.this,ShowActivity.class);
                startActivity(newActivity);

            }
        });


// Button3 (Update)
        final Button btn3 = (Button) findViewById(R.id.button3);
        // Perform action on click
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open Form ListUpdate
                Intent newActivity = new Intent(MainActivity.this,ListUpdateActivity.class);
                startActivity(newActivity);

            }
        });

// Button4 (Delete)
        final Button btn4 = (Button) findViewById(R.id.button4);
        // Perform action on click
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                // Open Form ListDelete
                Intent newActivity = new Intent(MainActivity.this,ListDeleteActivity.class);
                startActivity(newActivity);

            }
        });



    }






}



