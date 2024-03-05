
package jrpg;


public class Jobchange {

    public static void main(String[] args) {

      Newbie player1 = new Newbie("Abraar");
      Newbie player2 = new Mage("Arif");
      Newbie player3 = new Fighter("Faiz");
      Newbie player4 = new Archer("Faaris");
     

      Newbie[] kumpulanPlayer = {player1, player2, player3, player4};
      
      for (Newbie player : kumpulanPlayer) {
        player.display();
        player.useskill();
      }
    }
    
}
