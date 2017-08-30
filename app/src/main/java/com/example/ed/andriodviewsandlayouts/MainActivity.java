package com.example.ed.andriodviewsandlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInputValue;
    Button binUpdateTextValue;
    TextView tvDisplayValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etInputValue = (EditText) findViewById(R.id.etInputValue);
        binUpdateTextValue = (Button) findViewById(R.id.binDisplayValue);
        tvDisplayValue = (TextView) findViewById(R.id.tvDisplayValue);

        binUpdateTextValue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayText();
            }
        });

    }

    private void displayText() {
        String inputValue = etInputValue.getText().toString();
        inputValue = inputValue.replaceAll("\n","");
        tvDisplayValue.setText(inputValue);
    }

    public void updateTextView(View view) {
        displayText();
    }
}
