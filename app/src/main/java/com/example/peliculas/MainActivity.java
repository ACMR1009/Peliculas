package com.example.peliculas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo1;
    TextView txtDescripcion1;
    TextView txtTitulo2;
    TextView txtDescripcion2;
    TextView txtTitulo3;
    TextView txtDescripcion3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtTitulo1 = (TextView) findViewById(R.id.textView);
        txtDescripcion1 = (TextView) findViewById(R.id.textView2);
        txtTitulo2 = (TextView) findViewById(R.id.textView3);
        txtDescripcion2 = (TextView) findViewById(R.id.textView4);
        txtTitulo3 = (TextView) findViewById(R.id.textView5);
        txtDescripcion3 = (TextView) findViewById(R.id.textView6);

        txtTitulo1.setText("How To Train Your Dragos: The Hidden World");
        txtDescripcion1.setText("Cuando Hipo descubre que Chimuelo no es el único furia nocturna, debe ir en busca del mundo oculto.");
        txtTitulo2.setText("The Lego Movie: The Second Part");
        txtDescripcion2.setText("Han pasado 5 años y ahora los ciudadanos enfrentan una nueva amenaza: Invasores Lego DUPLO® del espacio exterior.");
        txtTitulo3.setText("Green Book");
        txtDescripcion3.setText("Un pianista negro contrata a un italoamericano para que sea su chofer y guardaespaldas durante una gira por el sur de los EUA en 1962.");

    }
}
