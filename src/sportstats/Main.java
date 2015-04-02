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
public class Main {
    
  public static void main(String []args){

SportStats football = new Football("American Football",11,600);
SportStats soccer = new Soccer("Soccer(Football)",11,90);
SportStats basketball = new Basketball("Basketball",5,40);
System.out.print(football.toString());
System.out.print(soccer.toString());
System.out.print(basketball.toString());

}
}  
}
