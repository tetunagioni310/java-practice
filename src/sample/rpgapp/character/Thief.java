package sample.rpgapp.character;
import sample.rpgapp.monster.Monster;

public class Thief extends Character {
	
	public Thief(String name, int hp) {
		super(name, hp);
	}
	
	public Thief() {
		super("とうぞく", 60);
	}
	
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃！");
		System.out.println("敵に5ポイントのダメージ");
		m.hp -= 3;
	}
}
