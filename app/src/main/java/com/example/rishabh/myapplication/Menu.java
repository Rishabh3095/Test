package com.example.rishabh.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    Button createPoll;
    Button createRating;
    Button userPolls;
    Button userRatings;
    Button logOut;
    Button viewAllRatings;
    Button viewAllPolls;
    TextView greetingText;

    String name = User.get().getName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        createPoll = (Button) findViewById(R.id.button_create_poll);
        createRating = (Button) findViewById(R.id.button_create_rating);
        userPolls = (Button) findViewById(R.id.button_view_edit_polls);
        userRatings = (Button) findViewById(R.id.button_view_edit_ratings);
        viewAllPolls = (Button) findViewById(R.id.button_view_all_polls);
        viewAllRatings = (Button) findViewById(R.id.button_view_all_ratings);
        logOut = (Button) findViewById(R.id.button_logout);
        greetingText = (TextView) findViewById(R.id.text_view_greeting);
        greetingText.setText("HELLO " + name.toUpperCase());


        createPoll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, CreatePoll.class));
            }
        });

        createRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, CreateRating.class));
            }
        });

        userRatings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, UserRatings.class));
            }
        });

        userPolls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, UserPolls.class));
            }
        });

        viewAllRatings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, AllRatings.class));
            }
        });

        viewAllPolls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, AllPolls.class));
            }
        });

        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Menu.this, MainActivity.class));
            }
        });
    }
    }