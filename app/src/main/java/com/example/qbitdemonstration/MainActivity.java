package com.example.qbitdemonstration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Calendar;

//hello
public class MainActivity extends AppCompatActivity {

    private ListView doctorsList ;
    private dListAdapter DListAdapter ;
    private Button dispenserButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        doctorsList = (ListView) findViewById(R.id.doctors_list) ;
        dispenserButton = (Button) findViewById(R.id.dispenserButton) ;

        DListAdapter = new dListAdapter(this, getResources().getStringArray(R.array.dListItems)) ;
        doctorsList.setAdapter(DListAdapter);

        doctorsList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), myDispenserActivity.class) ;
                    startActivity(intent);
                }

            }
        });

        dispenserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




    }
}
