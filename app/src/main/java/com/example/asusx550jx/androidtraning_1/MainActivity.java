package com.example.asusx550jx.androidtraning_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        TextView tvUsername = (TextView) findViewById(R.id.tvUsername); //identifier untuk dipakai pada new objek
        String username = getIntent().getStringExtra("username"); //untuk mengambil nilai yang ada di intent pada login activity
        tvUsername.setText(username); //set nilai contain menjadi username pada intent

    }
}
