package sample.StringBuilder;

public class Main {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 100; i++) {
			sb.append("Java");
		}
		String s = sb.toString();
		System.out.println(s);
	}
}
