/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csigaverseny;

import java.util.HashMap;
import java.util.Random;
        
/**
 *
 * @author norbert
 */
public class Game {
    
    private static final int MAX_ROUNDS = 5;
    
    private SnailColor currentBet;
    private HashMap<String, Snail> snails;
    
    public Game() {
        currentBet = SnailColor.NoColor;
        snails = new HashMap<>();
        snails.put(SnailColor.Blue.toString(), new Snail());
        snails.put(SnailColor.Green.toString(), new Snail());
        snails.put(SnailColor.Red.toString(), new Snail());
    }
    
    public void StartRace() {
        resetSnails();
        // Handle rounds
        for (int i = 1; i <= MAX_ROUNDS; i++){
            System.out.println("round: " + i);
            startRound();   
        }
        var winner = getWinner();
        System.out.println("winner: " + winner);
        if (currentBet.toString().equals(winner))
        {
            System.out.println("bet won");
        } else {
            System.out.println("bet lost, bet on: " + currentBet.toString() + ", winner: " + winner);
        }
    }
    
    private void resetSnails() {
        for (Snail snail : snails.values()) {
            snail.ResetDistance();
        }
    }
    
    private void startRound() {
        boolean boostUsed = false;
        for (Snail snail : snails.values()) {
            var currentStep = snail.Step();
            System.out.println("step: " + currentStep);
            if (!boostUsed && haveBoost()) {
                System.out.println("boosted");
                boostUsed = true;
                currentStep *= 2;
            }
            snail.AddDistance(currentStep);
        }
    }
    
    private boolean haveBoost() {
        Random rand = new Random();
        return rand.nextInt(1, 6) == 1;
    }
    
    private String getWinner() {
        int maxStep = -1;
        String winnerColor = "";
        for (var entry : snails.entrySet()) {
            var d = entry.getValue().GetDistance();
            System.out.println("snail: " + entry.getKey() + " distance: " + d);
            if (d > maxStep) {
                maxStep = d;
                winnerColor = entry.getKey();
            }
        }
        return winnerColor;
    }
    
    public void SetCurrentBet(SnailColor bet) {
        currentBet = bet;
    }
}
