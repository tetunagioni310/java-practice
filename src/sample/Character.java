package sample;

public abstract class Character {
	public String name;
	int hp;
	public void run() { System.out.println(this.name + "は逃げ出した。"); }
	public abstract void attack(Matango m);
}
