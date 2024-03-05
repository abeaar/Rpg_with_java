
package jrpg;


public class Mage extends Newbie {
    private String weapon;
    private String skill;
    private int mp;
    private int strength;
    private int dex;

    public Mage(String nama) {
        super(nama);
        setJob("Sorcerer");
        this.weapon = "Enchanted Cane";
        this.skill = "Lightning";
        allocateStats(13, 5, 2);
    }
    
    public void allocateStats(int mp, int strength, int dex) {
        this.mp = mp;
        this.strength = strength;
        this.dex = dex;       
    }

    public void display(){
        super.display();
        System.out.println("weapon\t\t: " + this.weapon);
        System.out.println("Stats:");
        System.out.println("MP\t\t: " + this.mp);
        System.out.println("Strength\t: " + this.strength);
        System.out.println("Dexterity\t: " + this.dex);
    }

    public void useskill(){
        System.out.println("Menggunakan\t: " + this.skill);
    }
}
