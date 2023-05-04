package sample;

public class Random {
	public static void main(String[] args) {
		int r = new java.util.Random().nextInt(30);
		System.out.println("あなたは多分、" + r + "歳ですね？");
	}
}
