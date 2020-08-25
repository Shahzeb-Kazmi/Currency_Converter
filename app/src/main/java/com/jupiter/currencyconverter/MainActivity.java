package com.jupiter.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){
        Log.i("info", "Button Pressed!");

        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);

        String AmountInPounds = editText.getText().toString();

        double AmountInPoundsDouble = Double.parseDouble(AmountInPounds);

        double AmountInDollars = (AmountInPoundsDouble * 1.31);

        String AmountInDollarsString = String.format("%.2f", AmountInDollars);

        Log.i("Amount In Dollars", AmountInDollarsString);

        Toast.makeText(this, "£" + AmountInPounds + " is $" + AmountInDollarsString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}