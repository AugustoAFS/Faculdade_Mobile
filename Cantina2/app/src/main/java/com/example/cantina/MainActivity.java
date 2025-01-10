package com.example.cantina;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private CheckBox Coxinha, Dogao, Coca, Todinho, Cafe, Cini, Hamburger, PaoQueijo, Esfirra;
    private TextView Resultados;

    // Preços dos itens
    private final double precoCoxinha = 6.70;
    private final double precoDogao = 6.45;
    private final double precoCoca = 5.00;
    private final double precoTodinho = 4.00;
    private final double precoCafe = 3.00;
    private final double precoCini = 2.50;
    private final double precoHamburger = 6.50;
    private final double precoPaoQueijo = 1.15;
    private final double precoEsfirra = 6.25;

    private double Total = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializando os CheckBoxes
        Coxinha = findViewById(R.id.CbCoxinha);
        Dogao = findViewById(R.id.CbDogao);
        Coca = findViewById(R.id.CbCoca);
        Todinho = findViewById(R.id.CbTodinho);
        Cafe = findViewById(R.id.CbCafe);
        Cini = findViewById(R.id.CbCini);
        Hamburger = findViewById(R.id.CbHamburgon);
        PaoQueijo = findViewById(R.id.CbPaoQueijo);
        Esfirra = findViewById(R.id.CbEsfirra);

        // Inicializando o TextView para exibir o total
        Resultados = findViewById(R.id.Resultado);

        // Configurando listeners para os CheckBoxes
        Coxinha.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        Dogao.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        Coca.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        Todinho.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        Cafe.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        Cini.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        Hamburger.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        PaoQueijo.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
        Esfirra.setOnCheckedChangeListener((buttonView, isChecked) -> calcularTotal());
    }

    private void calcularTotal() {
        Total = 0.0;

        if (Coxinha.isChecked()) Total += precoCoxinha;
        if (Dogao.isChecked()) Total += precoDogao;
        if (Coca.isChecked()) Total += precoCoca;
        if (Todinho.isChecked()) Total += precoTodinho;
        if (Cafe.isChecked()) Total += precoCafe;
        if (Cini.isChecked()) Total += precoCini;
        if (Hamburger.isChecked()) Total += precoHamburger;
        if (PaoQueijo.isChecked()) Total += precoPaoQueijo;
        if (Esfirra.isChecked()) Total += precoEsfirra;

        // Atualizando o TextView com o total
        Resultados.setText(String.format("%.2f", Total));
    }
}
