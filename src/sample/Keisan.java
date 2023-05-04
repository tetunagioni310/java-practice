package sample;

public class Keisan {
	public static void main(String[] args) {
		int sum = add(add(130, 45), add(35, 46));
		System.out.println("合計は" + sum);
	}
	
	public static int add(int x, int y) {
		int sum = x + y;
		return sum;
	}
}
