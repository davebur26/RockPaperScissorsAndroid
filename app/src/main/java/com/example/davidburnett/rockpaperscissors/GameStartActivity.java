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
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_start);


        rockButton = (Button) findViewById(R.id.rock_input_text);
        paperButton = (Button) findViewById(R.id.paper_input_text);
        scissorsButton = (Button) findViewById(R.id.scissors_input_text);
//        computerResultText = (Button) findViewById(R.id.computer_result_text);

        resultText = (TextView) findViewById(R.id.result_text);
    }

    public void onRockButtonClicked(View button) {

        Game game = new Game();
        String winner = game.playHand("Rock");
        resultText.setText(winner);

    }

    public void onPaperButtonClicked(View button) {

        Game game = new Game();
        String winner = game.playHand("Paper");
        resultText.setText(winner);

    }

    public void onScissorsButtonClicked(View button) {

        Game game = new Game();
        String winner = game.playHand("Scissors");
//        String computerHand =
//        resultText.
        resultText.setText(winner);

    }










}
