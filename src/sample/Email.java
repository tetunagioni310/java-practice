package sample;

public class Email {
	public static void main(String[] args) {
		String address = "メールの宛先アドレス";
		String text = "メールの本文";
		String title = "メールタイトル";
		email(address, text);
		
		email(title, address, text);
	}
	
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：無題");
		System.out.println("本文：" + text);
		System.out.println("-----");
	}
	
	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名：" + title);
		System.out.println("本文：" + text);
	}
}
