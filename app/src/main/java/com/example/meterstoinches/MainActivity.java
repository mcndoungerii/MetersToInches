package com.example.meterstoinches;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button convertButton;
    private EditText editText;
    private TextView showText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //call a handlers
        convertButton = (Button) findViewById(R.id.convertId);
        editText = (EditText) findViewById(R.id.metersEditText);
        showText = (TextView) findViewById(R.id.inchTextViewId);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}