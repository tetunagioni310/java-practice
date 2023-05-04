package sample.rpgapp.character;
import sample.rpgapp.item.Wand;
import sample.rpgapp.monster.Monster;


public class Wizard extends Character {
	//　メンバ変数	
	private int mp;
	static final int MAX_HP = 50;
	static final int MAX_MP = 10;
	private Wand wand;
	
	//　コンストラクタ	
	public Wizard(String name, int hp, int mp) {
		super(name,hp);
		this.setMp(mp);
		this.setWand();
	}
	//	コンストラクタ　変数ない場合
	public Wizard() {
		super("まほうつかい", 40);
		this.setMp(100);
		this.setWand();
	}
	
	//	MPセット
	public void setMp(int mp) {
		if (0 > mp) {
			throw new IllegalArgumentException
				("MPに負の値がセットされています。処理を中断します。");
		}
		this.mp = mp;
	}
	
	//	MP取得
	public int getMp() { return this.mp; }
	
	//	Wandセット
	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException
				("杖がnullです。処理を中断。");
		}
		if (wand.getName().length() < 3 ) {
			throw new IllegalArgumentException
				("名前が短過ぎます。処理を中断。");
		}
		if ( wand.getPower() < 0.5 || 100 < wand.getPower() ) {
			throw new IllegalArgumentException
				("増幅率が規定値を下回るまたは上回っています。処理を中断します。");
		}
		this.wand = wand;
	}
	
	//	wandセット 変数がない場合
	public void setWand() {
		this.wand = new Wand();
	}
	
	//	wand　を取得
	public Wand getWand() {
		return this.wand;
	}
	
	//　healメソッド	
	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int)(basePoint * this.getWand().getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println
			(h.getName() + "のHPを" + recovPoint + "回復した！");
	}
	
	//	attacメソッド
	public void attack(Monster m) {
		System.out.println(this.getName() + "の攻撃！");
		System.out.println("敵に3ポイントのダメージ");
		m.hp -= 3;
	}
	
	//	fireballメソッド
	public void fireball(Monster m) {
		System.out.println(this.getName() + "は火の玉を放った！");
		System.out.println("敵に20ポイントのダメージ");
		m.hp -= 20;
		this.mp -= 5;
	}
}
