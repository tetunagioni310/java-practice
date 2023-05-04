package sample.rpgapp.monster;

public class DeathBat extends Monster {
	public final int LEVEL = 15;
	public DeathBat() {
        this.suffix = 'A';
        this.hp = 80;
        this.name = "デスバット";
    }
    public void run() {
        System.out.println(this.name + this.suffix + "は羽ばたいて逃げ出した！");
    }
}
