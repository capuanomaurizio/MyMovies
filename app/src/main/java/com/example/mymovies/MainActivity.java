package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblTitolo;
    private Button btnPopola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblTitolo = findViewById(R.id.lblTitolo);
        btnPopola = findViewById(R.id.btnPopola);
    }

    public void start(View v){
        Intent i = new Intent(getApplicationContext(), ListActivity.class);
        startActivity(i);
    }
}