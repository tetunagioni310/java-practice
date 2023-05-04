package sample.rpgapp.item;

public abstract class Weapon extends Item {
	private int damage;
	
	public Weapon(String name, int price, int damage) {
		super(name, price);
		this.setDamage(damage);
	}
	
	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public int getDamage() {
		return this.damage;
	}
}
