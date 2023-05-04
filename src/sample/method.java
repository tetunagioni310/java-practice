package sample;

public class method {
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出します");
		hello("工藤");
		hello("佐藤");
		hello("須藤");
		System.out.println("メソッドの呼び出しが終了しました");
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、こんにちは！");
	}
}
