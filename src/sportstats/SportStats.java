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
public class SportStats {

public String name;
public int numberOfPlayers;
public int timeOfFullGame;
public SportStats(String sport, int players, int time){
        this.name = sport;
        this.numberOfPlayers = players;
        this.timeOfFullGame = time;
        }
public String toString(){
return "Name of Sport\n" + name + "Number of players:\n" + numberOfPlayers + 
        "Time Of Game" + timeOfFullGame;
            }
}

