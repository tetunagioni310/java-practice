package sample.rpgapp.monster;

public class Goblin extends Monster {
	public final int LEVEL = 10;
	
	public Goblin() {
        this.suffix = 'A';
        this.hp = 20;
        this.name = "マタンゴ";
    }
    public void run() {
        System.out.println(this.name + this.suffix + "は腕をふって逃げ出した！");
    }
}
