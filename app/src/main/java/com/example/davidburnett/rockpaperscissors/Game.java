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


    public Game(){}

    private String getRandomHand(){
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return hands[randomNumber];
    }



    public String playHand(String playerChoice) {
        String computerChoice = getRandomHand();
        if (playerChoice.equals(computerChoice)) {
            return "The computer chose " + computerChoice + ", It's a draw!";
        } else if (playerChoice.equals("Paper") && computerChoice.equals("Rock")) {
            return "The computer chose " + computerChoice + ", You win!";
        } else if (playerChoice.equals("Rock") && computerChoice.equals("Scissors")) {
            return "The computer chose " + computerChoice + ", You win!";
        } else if (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) {
            return "The computer chose " + computerChoice + ", You win!";
        } else {
            return "The computer chose " + computerChoice + ", The computer wins!";
        }
    }
}

