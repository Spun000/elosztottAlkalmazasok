/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csigaverseny;

/**
 *
 * @author norbert
 */
abstract class Racer {
    private int currentDistance;
    
    public int GetDistance() {
        return currentDistance;
    }
    
    public void AddDistance(int distance) {
        currentDistance += distance;
    }
    
    public void ResetDistance() {
        currentDistance = 0;
    }
    
    public abstract int Step();
    
}
