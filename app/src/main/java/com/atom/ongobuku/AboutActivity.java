package com.atom.ongobuku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
    Toolbar toolbar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        textView = findViewById(R.id.tv2);

        toolbar = findViewById(R.id.toolbar_view);
        setSupportActionBar(toolbar);
        toolbar.setTitle("About");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To return to main activity
                AboutActivity.super.onBackPressed();
            }
        });
        textView.setText("Developer:Prince Software Systems\nAbout:List of all lugbara hymns.\nFeedback\nemail:princesoftwaresystems@gmail.com\nWebsite:princesoftwaresystems.blogspot.com");
    }
}