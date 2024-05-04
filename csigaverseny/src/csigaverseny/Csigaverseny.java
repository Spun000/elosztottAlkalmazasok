/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package csigaverseny;

public class Csigaverseny {

    public static void main(String[] args) {
        Game game = new Game();
        game.SetCurrentBet(SnailColor.Blue);
        game.StartRace();
        Gui.InitGui(game);
    }
    
}
