package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Payment extends AppCompatActivity {
    ImageView button;
    TextView textViewCompleted,textViewClick;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        button= findViewById(R.id.rrectangle);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });


        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
    }
}
