package jrpg;

public class Newbie {
	private String nama;
   	private String job;

	public Newbie(String nama, String job){
		this.nama = nama;
		this.job = job;
	}

	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getJob () {
		return job;
	}
	public void setJob (String job) {
		this.job = job;
	}

	void display(){
		System.out.println("\nName \t\t: " + this.nama);
		System.out.println("Job \t\t: " + this.job);
	}
    void useskill(){
        System.out.println("Using Skill \t: No Skills");
    }

}