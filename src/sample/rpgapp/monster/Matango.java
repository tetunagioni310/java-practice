package sample.rpgapp.monster;

public class Matango extends Monster { 
    public final int LEVEL = 10;

    public Matango() {
        this.suffix = 'A';
        this.hp = 20;
        this.name = "マタンゴ";
    }
    public void run() {
        System.out.println(this.name + this.suffix + "は逃げ出した！");
    }
}

