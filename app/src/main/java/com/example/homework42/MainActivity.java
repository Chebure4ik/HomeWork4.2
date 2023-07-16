package com.example.homework42;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idIn;
    private EditText departurePointIn;
    private EditText timeIn;
    private TextView priceIn;
    private Button button;

    private float price = 99.9F;
    private int id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idIn = findViewById(R.id.idIn);
        departurePointIn = findViewById(R.id.departurePointIn);
        timeIn = findViewById(R.id.timeIn);
        priceIn = findViewById(R.id.priceIn);
        button = findViewById(R.id.button);

        priceIn.setText("Стоимость билета: " + price);

        button.setOnClickListener(listener);
    }
    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(getApplicationContext(), SecondActivity.class);

            intent.putExtra("idIn",idIn.getText().toString());
            intent.putExtra("departurePointIn",departurePointIn.getText().toString());
            intent.putExtra("timeIn",timeIn.getText().toString());
            intent.putExtra("priceIn",priceIn.getText().toString());

            startActivity(intent);
        }
    };
}