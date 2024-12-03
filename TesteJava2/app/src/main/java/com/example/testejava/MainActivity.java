package com.example.testejava;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button bt1, bt2, bt3;
    private ImageView img1;
    private boolean flag = true;
    private int cont = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        img1 = findViewById(R.id.img1);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickButton();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickReset();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickChange();
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClickImg();
            }
        });
    }

    private void ClickButton() {
        img1.setVisibility(View.VISIBLE);
        img1.setBackgroundResource(R.drawable.foto);
        Toast.makeText(this, "Imagem Carregada com sucesso", Toast.LENGTH_SHORT).show();
    }

    private void ClickReset() {
        img1.setVisibility(View.GONE);
        Toast.makeText(this, "Click Reset", Toast.LENGTH_SHORT).show();
    }

    private void ClickChange() {
        switch (cont) {
            case 1:
                img1.setBackgroundResource(R.drawable.foto_antiga);
                break;
            case 2:
                img1.setBackgroundResource(R.drawable.dragonbool);
                break;
            case 3:
                img1.setBackgroundResource(R.drawable.sol);
                break;
            case 4:
                img1.setBackgroundResource(R.drawable.foto);
                break;
            case 5:
                img1.setBackgroundResource(R.drawable.elevador);
                break;
            case 6:
                img1.setBackgroundResource(R.drawable.karate);
                break;
            case 7:
                img1.setBackgroundResource(R.drawable.download);
                break;
        }
        cont++;
        if (cont > 7) {
            cont = 1;
        }
        Toast.makeText(this, "Imagem Movida", Toast.LENGTH_SHORT).show();
    }

    private void ClickImg() {
        if (flag) {
            img1.animate().rotationX(360);
        } else {
            img1.animate().rotationX(0);
        }
        flag = !flag;
    }
}
