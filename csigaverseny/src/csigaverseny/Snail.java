/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csigaverseny;

import java.util.Random

enum SnailColor {
    NoColor,
    Blue,
    Green,
    Red
}
        
/**
 *
 * @author norbert
 */
public class Snail extends Racer {
    private static final Random rand = new Random();
    private static final int MIN_DISTANCE = 0;
    private static final int MAX_DISTANCE = 3;
    
    @Override
    public int Step() {
     return rand.nextInt(MIN_DISTANCE, MAX_DISTANCE+1);
    }
}
