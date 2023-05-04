package sample.rensyu3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		List<Hero> hs = new ArrayList<Hero>();
		Hero h1 = new Hero("斉藤");
		Hero h2 = new Hero("鈴木");
		hs.add(h1);
		hs.add(h2);
		
		for (Hero h : hs ) {
			System.out.println(h.getName());
		}
		
		Map<Hero, Integer> toubatu = new HashMap<Hero, Integer>();
		toubatu.put(h1, 3);
		toubatu.put(h2, 7);
		
		for (Hero key : toubatu.keySet()) {
			int value = toubatu.get(key);
			System.out.println(key.getName() + "が倒した敵の数＝" + value);
		}
	}
}
