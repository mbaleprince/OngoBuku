package com.atom.ongobuku;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PageView extends AppCompatActivity {
    Toolbar toolbar;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_view);
        //toolbar
        toolbar = findViewById(R.id.toolbar_view);
        setSupportActionBar(toolbar);
        String title =getIntent().getStringExtra("title");
        toolbar.setTitle(title);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //To return to main activity
                PageView.super.onBackPressed();
            }
        });
        textView = findViewById(R.id.text_page_view);
        String subtext = getIntent().getStringExtra("subtext");
        textView.setText(subtext);
    }
}
