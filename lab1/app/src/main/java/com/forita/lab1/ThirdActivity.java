package com.forita.lab1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Switch;



public class ThirdActivity extends Activity {

    Switch switch1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_third);

        switch1 = (Switch) findViewById(R.id.switch1);

        switch1.setTextOn("On");
        switch1.setTextOff("Off");
    }
}
