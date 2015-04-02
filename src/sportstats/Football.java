/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sportstats;

/**
 *
 * @author neliloghmani
 */
 public class Football extends SportStats{
   
    public Football(String sport, int players, int time)
    {
        super(sport, players, time);
    }
    public String toString(){
 
 return "Name of Sport: " + name + "\nNumber of players: " + numberOfPlayers + 
        "\nTime Of Game: " + timeOfFullGame + "\nLast SuperBowl Champions were the New England Patriots\n"
         + "\n--------------------------\n"; 
    }
 
}