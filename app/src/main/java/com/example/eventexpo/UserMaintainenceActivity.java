package com.example.eventexpo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserMaintainenceActivity extends AppCompatActivity {
    private TextView homeTV, profileTV, aboutTV, historyTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_maintainence);

        homeTV = (TextView) findViewById(R.id.homeTV);
        profileTV = (TextView) findViewById(R.id.profileTV);
        aboutTV = (TextView) findViewById(R.id.aboutappTV);
        historyTV = (TextView) findViewById(R.id.order_historyTV);

        homeTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(UserMaintainenceActivity.this, UserHomeActivity.class);
                startActivity(homeIntent);
            }
        });

        profileTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent profileIntent = new Intent(UserMaintainenceActivity.this, UserHomeActivity.class);
                startActivity(profileIntent);
            }
        });

        aboutTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutIntent = new Intent(UserMaintainenceActivity.this, AboutAppActivity.class);
                startActivity(aboutIntent);
            }
        });

        historyTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent historyIntent = new Intent(UserMaintainenceActivity.this, OrderHistoryActivity.class);
                startActivity(historyIntent);
            }
        });



    }
}