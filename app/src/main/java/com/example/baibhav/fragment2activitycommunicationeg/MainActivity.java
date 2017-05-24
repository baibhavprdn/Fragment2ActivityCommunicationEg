package com.example.baibhav.fragment2activitycommunicationeg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopMessageFragment{

    TextView testmessage_tv=(TextView) findViewById(R.id.et_message);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void messagepasser(String msg) {
        testmessage_tv.setText(msg);
    }
}
