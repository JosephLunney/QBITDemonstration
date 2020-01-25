package com.example.qbitdemonstration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TimePicker;

public class myDispenserActivity extends AppCompatActivity {
    TimePicker pillTimeSetter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_dispenser);

        pillTimeSetter = (TimePicker) findViewById(R.id.pillTimePicker) ;


    }
}
