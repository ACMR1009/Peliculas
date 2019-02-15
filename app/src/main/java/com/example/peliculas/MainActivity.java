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
    }
}
