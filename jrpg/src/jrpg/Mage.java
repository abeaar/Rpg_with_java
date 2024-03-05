
package jrpg;


public class Mage extends Newbie {
    private String weapon;
    private String skill;

    public Mage(String nama) {
        super(nama, "Sorcerer");
        this.weapon = "Enchanted Cane";
        this.skill = "Lightning";
    }

    public void display(){
        super.display();
        System.out.println("weapon\t\t: " + this.weapon);
    }

    public void useskill(){
        System.out.println("Using Skill \t: " + this.skill);
    }
}