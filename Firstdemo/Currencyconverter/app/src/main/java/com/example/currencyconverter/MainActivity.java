package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void pressed (View view){

        EditText editText=(EditText) findViewById(R.id.editText);

        Double editTextDouble = Double.parseDouble(editText.getText().toString());

        Double poundamount = editTextDouble * 70.00;

        Toast.makeText(MainActivity.this,"Rs " + String.format("%.2f",poundamount),Toast.LENGTH_SHORT ).show();

        Log.i("amount",editText.getText().toString());


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
