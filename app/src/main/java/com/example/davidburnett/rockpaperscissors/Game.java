package com.example.davidburnett.rockpaperscissors;

import java.util.Random;

/**
 * Created by davidburnett on 19/09/2017.
 */

public class Game {



    String[] hands = {
            "Rock",
            "Paper",
            "Scissors"
    };
    String computerHand;


    public Game(){
        computerHand = null;
    }

    private void getRandomHand(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        computerHand = hands[randomNumber];
    }

    public String getComputerHand() {
        return computerHand;
    }

    public String playHand(String playerChoice) {
        getRandomHand();
        if (playerChoice.equals(computerHand)) {
            return "It's a draw!";
        } else if (playerChoice.equals("Paper") && computerHand.equals("Rock")) {
            return "You win!";
        } else if (playerChoice.equals("Rock") && computerHand.equals("Scissors")) {
            return "You win!";
        } else if (playerChoice.equals("Scissors") && computerHand.equals("Paper")) {
            return "You win!";
        } else {
            return "The computer wins!";
        }
    }
}

