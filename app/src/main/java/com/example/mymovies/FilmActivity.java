package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class FilmActivity extends AppCompatActivity {

    private TextView lblFilmTitle;
    private ImageView image;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_film);

        lblFilmTitle = (TextView)findViewById(R.id.lblFilmTitle);
        image = (ImageView)findViewById(R.id.locandina);
        btnClose = (Button)findViewById(R.id.btnClose2);

        Intent i = getIntent();
        lblFilmTitle.setText(i.getStringExtra("title"));
        String nomeEstensioneFile = i.getStringExtra("image");
        String nomeFile = nomeEstensioneFile.substring(0, nomeEstensioneFile.indexOf("."));
        int iden  = getResources().getIdentifier(nomeFile, "drawable", getPackageName());
        image.setImageResource(iden);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ListActivity.class);
                startActivity(i);
            }
        });
    }

}