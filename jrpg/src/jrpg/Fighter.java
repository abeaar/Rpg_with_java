
package jrpg;


public class Fighter extends Newbie {
    private String weapon;
    private String skill;

    public Fighter(String nama) {
        super(nama, "Brawler");
        this.weapon = "Knuckle Brass";
        this.skill = "Jab"; 
    }

    public void display(){
        super.display();
        System.out.println("weapon\t\t: " + this.weapon);
    }

    public void useskill(){
        System.out.println("Using Skill \t: " + this.skill);
    }

}