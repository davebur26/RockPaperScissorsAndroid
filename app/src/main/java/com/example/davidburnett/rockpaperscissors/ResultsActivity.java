package com.example.davidburnett.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    Game game1;
    TextView resultText;
    TextView computerHand;
    TextView playerHand;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        resultText = (TextView) findViewById(R.id.result_text);
        playerHand = (TextView) findViewById(R.id.player_hand_text);
        computerHand = (TextView) findViewById(R.id.computer_hand_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();

        String playerHandSelected = extras.getString("playerHand");

        game1 = new Game();
        String winner = game1.playHand(playerHandSelected);


        String computerHandText = "The Computer's hand was " + game1.getComputerHand();
        computerHand.setText(computerHandText);
        String playerHandText = "Your hand was " + playerHandSelected;
        playerHand.setText(playerHandText);
        resultText.setText(winner);

    }

}
