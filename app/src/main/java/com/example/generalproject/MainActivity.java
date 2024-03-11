package com.example.generalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private boolean ans = false;
    TextView yes;
    TextView no;
    Button btn;
    TextView txt;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes = findViewById(R.id.switch1);
        no = findViewById(R.id.switch2);
        btn = findViewById(R.id.button);
        txt = findViewById(R.id.text);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                yes.setCompoundDrawablesWithIntrinsicBounds(R.drawable.red_circle_2, 0, 0, 0);
                no.setCompoundDrawablesWithIntrinsicBounds(R.drawable.red_circle, 0, 0, 0);
                ans = false;
                txt.setVisibility(View.GONE);
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                no.setCompoundDrawablesWithIntrinsicBounds(R.drawable.red_circle_2, 0, 0, 0);
                yes.setCompoundDrawablesWithIntrinsicBounds(R.drawable.red_circle, 0, 0, 0);
                ans = true;
                txt.setVisibility(View.GONE);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setVisibility(View.VISIBLE);
                if(ans){
                    txt.setText("Correct Answer");
                }
                else{
                    txt.setText("wrong Answer");

                }
            }
        });

    }
}