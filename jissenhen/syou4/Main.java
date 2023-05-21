package syou4;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
	public static Integer len(String s) {
		return s.length();
	}
	
	public static void main(String[] args) {
		//	Function<引数, 戻り値>で記述
		//	lenメソッドの存在するメモリ番地を指す情報を渡している
		Function<String, Integer> func = Main::len;
		
		//	代入したメソッドをapply()で呼び出し、処理を実行	
		int a = func.apply("java");
		System.out.println("文字列「Java」は" + a + "文字です");
		
		Consumer<String> func2 = System.out::println;
		func2.accept("Hello, world!");
		
		Supplier<String> func3 = System::lineSeparator;
		System.out.println("改行します" + func3.get());
		
		BiFunction<String, String, String> func4 = System::getProperty;
		System.out.println(func4.apply("java.version", "不明"));
	}
}
