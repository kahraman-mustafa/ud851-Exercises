package com.example.android.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends AppCompatActivity {

    // COMPLETED (6) Create a TextView field to display your message
    // COMPLETED (7) Get a reference to your TextView in Java

    TextView mDisplayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        mDisplayTextView = (TextView) findViewById(R.id.tv_display);
    }
}
