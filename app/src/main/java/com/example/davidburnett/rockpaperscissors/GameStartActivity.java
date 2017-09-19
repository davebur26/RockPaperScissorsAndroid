package com.example.davidburnett.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameStartActivity extends AppCompatActivity {


    Button rockButton;
    Button paperButton;
    Button scissorsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_game_start);

        rockButton = (Button) findViewById(R.id.rock_input_text);
        paperButton = (Button) findViewById(R.id.paper_input_text);
        scissorsButton = (Button) findViewById(R.id.scissors_input_text);
    }

    public void onRockButtonClicked(View button) {
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("playerHand", "Rock");
        startActivity(intent);

    }

    public void onPaperButtonClicked(View button) {
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("playerHand", "Paper");
        startActivity(intent);

    }

    public void onScissorsButtonClicked(View button) {
        Intent intent = new Intent(this, ResultsActivity.class);
        intent.putExtra("playerHand", "Scissors");
        startActivity(intent);
    }










}
