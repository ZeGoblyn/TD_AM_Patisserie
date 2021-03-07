package com.example.td_planete;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView receiver_N;
    TextView receiver_S;
    TextView receiver_R;
    TextView receiver_G;
    TextView receiver_T;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        receiver_N = (TextView)findViewById(R.id.textNm);
        receiver_S = (TextView)findViewById(R.id.textSup);
        receiver_R = (TextView)findViewById(R.id.textRot);
        receiver_G = (TextView)findViewById(R.id.textGrav);
        receiver_T = (TextView)findViewById(R.id.textTemp);

        Intent intent = getIntent();

        String stN = intent.getStringExtra("message_nm");
        receiver_N.setText(stN);

        String stS = intent.getStringExtra("message_sup");
        receiver_S.setText(stS);

        String stR = intent.getStringExtra("message_rot");
        receiver_R.setText(stR);

        String stG = intent.getStringExtra("message_grav");
        receiver_G.setText(stG);

        String stT = intent.getStringExtra("message_temp");
        receiver_T.setText(stT);
    }
}