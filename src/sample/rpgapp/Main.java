package sample.rpgapp;
import sample.rpgapp.character.Hero;
import sample.rpgapp.character.Wizard;
import sample.rpgapp.item.Wand;

public class Main {
	public static void main(String[] args) {
//		Character[] c = new Character[5];
//		c[0] = new Hero();
//		c[1] = new Hero();
//		c[2] = new Thief();
//		c[3] = new Wizard();
//		c[4] = new Wizard();
////		冒険開始
////		まず宿屋に泊まる
//		for(Character ch : c) {
//			ch.hp += 50;
//			System.out.println(ch.hp);
//		}
//		Monster[] monsters = new Monster[5];
//		monsters[0] = new Slime();
//		monsters[1] = new Goblin();
//		monsters[2] = new Matango();
//		monsters[3] = new DeathBat();
//		c[0].attack(monsters[0]);
//		for(Monster m : monsters) {
//			m.run();
//		}
//		Hero h = (Hero)c[0];
//		Hero h = new Hero();
//		h.setName("aaaaaaaaaaaaa");
		Hero h = new Hero();
		Wizard w = new Wizard();
		System.out.println(w.getName());
		System.out.println(h.getName());
		w.heal(h);
		Wand wand = new Wand("魔導士の杖",200,30,40);
		w.setWand(wand);
		System.out.println(w.getWand().getName());
		Hero.setRandomMoney();
		System.out.println(Hero.money);
		Hero h2 = new Hero();
		System.out.println(h2.money);
	}
}
