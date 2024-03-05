
package jrpg;


public class Fighter extends Newbie {
    private String weapon;
    private String skill;
    private int mp;
    private int strength;
    private int dex;

    public Fighter(String nama) {
        super(nama);
        setJob("Brawler");
        this.weapon = "Knuckles Brass";
        this.skill = "Jab";
        allocateStats(2, 15, 3);
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
