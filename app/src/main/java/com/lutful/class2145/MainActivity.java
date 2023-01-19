package com.lutful.class2145;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        tvDisplay = findViewById(R.id.tvDisplay);

        return button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String sUnit = editText.getText().toString();
                float units = Float.parseFloat(sUnit);
                float bill = 0;

                if (units <= 50) bill = (float) (units * 0.50);
                else if (units <= 150) bill = (float) (25 + (units - 50) * 0.75);
                else if (units <= 250) bill = (float) (25 + 75 + (units - 150) * 1.20);
                else bill = (float) (25 + 75 + 120 + (units - 250) * 1.50);


                bill = (float) (bill + bill * 0.20);

                tvDisplay.setText("total current bill = " + bill + "Taka");

            });

        }
                ;
    }