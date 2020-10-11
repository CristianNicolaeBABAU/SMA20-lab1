package com.example.helloandroid2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSubmit;
        final TextView txtDisplay;
        final EditText txtInput;


        btnSubmit = (Button)findViewById(R.id.btnSubmit);
        txtDisplay = (TextView)findViewById(R.id.txtDisplay);
        txtInput = (EditText)findViewById(R.id.txtInput);

        //define the onclick method of btnSubmit
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtDisplay.setTextColor(Color.parseColor("#0000FF"));
                txtDisplay.setText("Hello, " + txtInput.getText());
                Toast.makeText(MainActivity.this, "Say Hello!", Toast.LENGTH_SHORT).show();
            }
        });

    }
}