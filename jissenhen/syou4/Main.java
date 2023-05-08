package syou4;
import java.util.function.Function;

public class Main {
	public static Integer len(String s) {
		return s.length();
	}
	
	public static void main(String[] args) {
		//	Function<引数, 戻り値>で記述	
		Function<String, Integer> func = Main::len;
		
		int a = func.apply("java");
		System.out.println("文字列「Java」は" + a + "文字です");
	}
}
