/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jrpg;


public class Jobchange {

    public static void main(String[] args) {

      Newbie player1 = new Newbie("abraar", "Newbie");
      Mage player2 = new Mage("Arif");
      Fighter player3 = new Fighter("Faiz");
      Archer player4 = new Archer("Faaris");
     

      Newbie[] kumpulanPlayer = new Newbie[4];
      kumpulanPlayer[0] = player1;
      kumpulanPlayer[1] = player2;
      kumpulanPlayer[2] = player3;
      kumpulanPlayer[3] = player4;

      for (int i=0; i<4; i++) {
        kumpulanPlayer[i].display();
        kumpulanPlayer[i].useskill();
      }
    }
    
}
