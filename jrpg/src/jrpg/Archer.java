
package jrpg;


public class Archer extends Newbie {
    private String weapon;
    private String skill;
    private int mp;
    private int strength;
    private int dex;

    public Archer(String nama) {
        super(nama);
        setJob("Marksman");
        this.weapon = "Cross Bow";
        this.skill = "Snipe";
        allocateStats(5, 2, 13);
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
