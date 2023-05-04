package sample.rpgapp.character;
import sample.rpgapp.item.Sword;
import sample.rpgapp.monster.Monster;

public class Hero extends Character {
	//メンバ変数　privateなフィールドでも同じクラスのメソッドからは呼び出せる	private String name;
	private Sword sword;
	public static int money;
    
	public Hero(String name, int hp, Sword sword) {
		super(name, hp);
		this.setSword();
	}
	
	public Hero() {
		super("ゆうしゃ", 100);
		this.setSword();
	}
    
	//	Sword
	public void setSword() {
		this.sword = new Sword();
	}
	
	public void setSword(Sword sword) {
		this.sword = sword;
	}
	
	public Sword getSword() {
		return this.sword;
	}
	
    // 戦う
    public void attack(Monster m) {
        System.out.println( this.getName() + "の攻撃！");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた!");
    }
    
    public static void setRandomMoney() {
    	Hero.money = (int)(Math.random() * 1000);
    }

    private void die() {
    	System.out.println(this.getName() + "は、死んでしまった！");
    	System.out.println("GAME OVERです。");
    }
}

