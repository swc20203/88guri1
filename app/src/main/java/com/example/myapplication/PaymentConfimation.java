package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentConfimation  extends AppCompatActivity {
    ImageView button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
    boolean isButton1Clicked = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_confirmation);

        button1 =findViewById(R.id.imageView4);
        button2 =findViewById(R.id.imageView6);
        button3 =findViewById(R.id.imageView8);
        button4 =findViewById(R.id.imageView10);
        button5 =findViewById(R.id.imageView12);
        button6 =findViewById(R.id.imageView14);
        button7 =findViewById(R.id.imageView16);
        button8 =findViewById(R.id.imageView18);
        button9 =findViewById(R.id.imageView20);
        button10 =findViewById(R.id.imageView22);
        button11 =findViewById(R.id.imageView24);
        button12 =findViewById(R.id.imageView26);



        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button10.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button11.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });

        button12.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                isButton1Clicked = !isButton1Clicked;
                if (isButton1Clicked) {
                    button1.setImageResource(R.drawable.yrectangle);
                } else {
                    button1.setImageResource(R.drawable.prectangle);
                }

            }
        });


    }
}
