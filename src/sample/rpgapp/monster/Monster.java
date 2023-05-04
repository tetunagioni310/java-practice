package sample.rpgapp.monster;

public abstract class Monster {
	public String name;
    public int hp;
    public char suffix;
    
	public void run() {
		System.out.println("モンスターは逃げ出した。");
	}
}
