package br.com.mauricio.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    public void converter(View view){
        EditText valueToConverter = (EditText)findViewById(R.id.currency);
        Double valueConverted = convertRealToDollar(valueToConverter.getText().toString());
        String toastValue = "U$ " + valueConverted.toString();

        Toast.makeText(getApplicationContext(),toastValue, Toast.LENGTH_LONG).show();
    }

    private double convertRealToDollar(String value) {
        Double realAmmount = Double.parseDouble(value);

        return realAmmount * 0.26;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
