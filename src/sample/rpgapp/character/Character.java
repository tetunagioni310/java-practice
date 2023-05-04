package sample.rpgapp.character;
import sample.rpgapp.monster.Monster;

public abstract class Character {
	private String name;
	private int hp;
	
	public Character(String name, int hp) {
		this.setName(name);
		this.setHp(hp);
	}
	
	public void setName(String name) {
    	// throwは任意のタイミングで例外を発生させて、例外処理を行える    	
		if (name == null || name.length() < 3) {
			throw new IllegalArgumentException
				("名前が記述されていない、もしくは文字数が足りません。処理を中断します。");
		}
		this.name = name;
    }
	
	public String getName() {
		return this.name;
	}
	
	public void setHp(int hp) {
		if (0 > hp) { this.hp = 0; } else { this.hp = hp; }
	}
	
	public int getHp() {
		return this.hp;
	}
	
	// メソッドにfainalをつけるとオーバーライド禁止となる
    public final void slip() {
        this.hp -= 5;
        System.out.println(this.getName() + "は転んだ！");
        System.out.println("5のダメージ");
    }
    
    public final void sleep() {
    	this.hp = 100;
    	System.out.println(this.getName() + "は、眠って回復した");
    }
	
	public void run() { System.out.println(this.name + "は逃げ出した。"); }
	
	public abstract void attack(Monster m);
}
