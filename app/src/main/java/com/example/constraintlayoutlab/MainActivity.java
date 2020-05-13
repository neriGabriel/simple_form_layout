package com.example.constraintlayoutlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroupGender;
    RadioButton radioButtonGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       this.radioGroupGender = findViewById(R.id.radioGroupGenero);
    }

    public void selectGender(View view) {
        int radioButtonGenderId = this.radioGroupGender.getCheckedRadioButtonId();
        this.radioButtonGender = findViewById(radioButtonGenderId);

        Log.i("MainActivity", radioButtonGender.getText().toString());
    }
}
