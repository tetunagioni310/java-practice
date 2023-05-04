package sample.rpgapp.item;

public class Wand extends Weapon {
	//	メンバ変数
	private double power;	// 杖の魔力
	
	//	コンストラクタ
	public Wand(String name, int price, int damage, double power) {
		super(name, price, damage);
		this.setPower(power);
	}
	
	public Wand() {
		super("まほうの杖", 150, 10);
		this.setPower(20);
	}
	
	//	Power
	public void setPower(double power) {
		this.power = power;
	}
	
	public double getPower() {
		return this.power;
	}
}
