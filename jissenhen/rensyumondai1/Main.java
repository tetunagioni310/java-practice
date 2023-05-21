package rensyumondai1;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.IntPredicate;

public class Main {
	public static void main(String[] args) {		
		IntPredicate f1 = i ->  i % 2 == 1;
		BiFunction<Integer, String, String> f2 = 
				(point, name) -> { return name + "さんは" + (point > 65 ? "合格" : "不合格"); };
		System.out.println(f1.test(15));
		System.out.println(f2.apply(70, "takashi"));
		
		List<String> names = List.of("菅原 拓真", "湊 雄輔", "朝香 あゆみ", "大江 岳人");
		names.stream().filter( n -> n.length() <= 4 )
		.map(n -> n + "さん")
		.forEach(System.out::println);
	}
}
