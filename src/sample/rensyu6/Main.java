package sample.rensyu6;

public class Main {
	public static void main(String[] args) {
		try {
		int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("エラー：" + e.getMessage());
		}
	}
}
