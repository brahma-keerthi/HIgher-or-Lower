package com.example.lowerorhigher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int compNum;
    Random rand = new Random();
    public void guessNumber(View v){
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        if ( guessEditText.getText().toString().isEmpty())
            Toast.makeText(MainActivity.this, "Enter the number...", Toast.LENGTH_SHORT).show();
        else {
            int guess = Integer.parseInt(guessEditText.getText().toString());

            if (guess > compNum) {
                Toast.makeText(MainActivity.this, "Lower!!", Toast.LENGTH_SHORT).show();
            } else if (guess < compNum) {
                Toast.makeText(MainActivity.this, "Higher!!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Guess is Correct\nTry a new play!!", Toast.LENGTH_SHORT).show();
                compNum = rand.nextInt(20) + 1;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        compNum = rand.nextInt(20) + 1;
    }
}