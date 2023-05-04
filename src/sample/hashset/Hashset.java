package sample.hashset;
import java.util.HashMap;
import java.util.Map;

public class Hashset {
	public static void main(String[] args) {
		Map<String, Integer> words = new HashMap<String, Integer>();
		words.put("cat", 12);
		words.put("dog", 5);
		words.put("wolf", 20);
		words.put("panda", 9);
		for (String key : words.keySet()) {
			int value = words.get(key);
			System.out.println(value);
		}
	}
}
