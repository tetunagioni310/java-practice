package sample.rensyu5;

public class Main {
	public static void main(String[] args) {
		try {
		String s = null;
		System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 例外をcatchしました");
			System.out.println("--スタックトレース(ここから)--");
			System.out.println("エラー：" + e.getMessage());
			System.out.println("--スタックトレース(ここまで)--");
		}
	}
}
