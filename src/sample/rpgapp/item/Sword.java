package sample.rpgapp.item;

public class Sword extends Weapon {
	
	//	コンストラクタ
	public Sword(String name, int price, int damage) {
		super(name, price, damage);
	}
	
	public Sword() {
		super("てつの剣", 300, 20);
	}
}