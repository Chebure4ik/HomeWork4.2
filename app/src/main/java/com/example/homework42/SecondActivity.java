package com.example.homework42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView info;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        info = findViewById(R.id.info);
        button = findViewById(R.id.button);

        Bundle bundleInfo = getIntent().getExtras();

        info.setText("Информация по билету " + "\n" + "Идентификатор пользователя: " + bundleInfo.get("idIn")
                + "\n" + "Пункт назначения: " + bundleInfo.get("departurePointIn")
                + "\n" + "Время отправления: " + bundleInfo.get("timeIn")
                + "\n" + bundleInfo.get("priceIn"));

        button.setOnClickListener(listener);

    }

    private View.OnClickListener listener = view -> {
      startActivity(new Intent(getApplicationContext(), MainActivity.class));
    };
}
