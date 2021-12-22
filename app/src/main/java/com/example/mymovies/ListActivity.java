package com.example.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    private ListView lsvwList;
    private Button btnClose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        lsvwList = findViewById(R.id.lsvwList);
        btnClose = findViewById(R.id.btnClose);
        String[] movies = new String[] {"Intentstellar", "La La Lamb", "The lord of the onion rings", "Harry Plotter", "La vita è Ornella",
                "Alla ricerca del Buggy", "La scheda madre ha perso il binario", "PHP: recursive acronym", "Avengers: Endpoint",
                "Salvate il soldato Python", "Quasi nemici", "WALL C", "Il buio oltre il frontend", "Non aprire quella porta (80)",
                "Monty Python e il Sacro Java", "The wall of wolfstreet", "V per incollare", "Il pigiama con il bambino a righe", "Jurassic bugs",
                "The truBOOL show", "L'esorC#ista", "Mary PoP3ins"};
        String[] images = new String[] {"intentstellar.jpg", "lalalamb.jpg", "lordoftheonions.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg",
                "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg",
                "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", "locandina.jpg", };
        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, movies);
        lsvwList.setAdapter(itemsAdapter);
        lsvwList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), FilmActivity.class);
                i.putExtra("title", (String)lsvwList.getItemAtPosition(position));
                i.putExtra("image", images[position]);
                startActivity(i);
            }
        });
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}