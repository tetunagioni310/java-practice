package sample.rpgapp.monster;

public class Slime extends Monster {
	 public final int LEVEL = 3;
	 
	 public Slime() {
	        this.suffix = 'A';
	        this.hp = 10;
	        this.name = "スライム";
	    }
	    public void run() {
	        System.out.println(this.name + this.suffix + "は体をうねらせて逃げ出した！");
	    }
}
