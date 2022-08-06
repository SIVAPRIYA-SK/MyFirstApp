package com.siva.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // We define edit text here bcz it is on the onCreate method of the application
//        EditText edtTxtName = findViewById(R.id.edtTxtName);
//        edtTxtName.getText().toString();
    }

    // Creating method to make the button work(to display "Hello" after clicking the button)
    public void onBtnClick (View view) {
        TextView txtHello = findViewById(R.id.txtMessage);

        // We define edit text here bcz it is not in the scope of onBtnClick Method
        EditText edtTxtName = findViewById(R.id.edtTxtName);

        // setText --> To change the text inside the TextView; getText --> get input from the user; toString --> converts to String type
        txtHello.setText("Hello " + edtTxtName.getText().toString());
    }
}