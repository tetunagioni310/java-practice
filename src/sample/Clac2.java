package sample;

public class Clac2 {
	public static void main(String[] args) {
		int a = 10; int b = 2;
		int total = Clac2Logic.tasu(a, b);
		int delta = Clac2Logic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
