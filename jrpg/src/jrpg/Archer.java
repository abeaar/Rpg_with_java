
package jrpg;

public class Archer extends Newbie{
    private String weapon;
    private String skill;
    
    public Archer(String nama) {
        super(nama, "Musketeer");
        this.weapon = "Cross Bow";     
        this.skill = "Snipe";     
    }

    public void display(){
        super.display();
        System.out.println("weapon\t\t: " + this.weapon);
    }

    public void useskill(){
        System.out.println("Using Skill \t: " + this.skill);
    }
}
