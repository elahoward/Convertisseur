package com.ejh.convertisseur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText tempNumber;

public void convert (View view) {
    Double c;
    Double f;
    Double t;
    tempNumber = findViewById(R.id.tempNumber);
    c = Double.parseDouble(tempNumber.getText().toString());
    t= c*1.8;
    f = t + 32;
    InputMethodManager mgr=(InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
    mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);

    Toast.makeText(MainActivity.this, String.format("%.2f", f)+ "º F",Toast.LENGTH_LONG).show();
}

Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}