package com.londonappbrewery.climapm;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class ChangeCityController extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.change_city_layout);
        ImageButton mBackButton = findViewById(R.id.mybackButton);
        final EditText mEditTextField = findViewById(R.id.queryET);

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        mEditTextField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {

                String newCity = mEditTextField.getText().toString();
                Intent cangeCityIntent = new Intent(ChangeCityController.this, WeatherController.class);
                cangeCityIntent.putExtra("city", newCity);

                startActivity(cangeCityIntent);

                return false;
            }
        });
    }
}
