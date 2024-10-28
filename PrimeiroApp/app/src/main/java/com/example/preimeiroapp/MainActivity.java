package com.example.preimeiroapp;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        TextView clickCountTextView = findViewById(R.id.clickCountTextView);
        Button button = findViewById(R.id.button);

        button.setOnClickListener(v -> {
            clickCount++;
            clickCountTextView.setText(getString(R.string.click_count, clickCount));
        });
    }
}
