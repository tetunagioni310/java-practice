package sample.collection;
import java.util.ArrayList;

public class Main {
//	ArrayListは配列とよく似たもの。リスト構造でデータを格納できる
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("たなか");
		names.add("すずき");
		names.add("さいとう");
		
		System.out.println(names.get(1));
	}
}
