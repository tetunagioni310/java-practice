package sample.Stringtyousa;

public class Main {
	public static void main(String[] args) {
		String s1 = "Java and JavaScript";
		String s2 = "Java";
		String s3 = "java";
		String s4 = "Javaprograming";
		
		//	左辺と右辺が等しいか検証する	
		if (s2.equals(s3)) {
			System.out.println("s2とs3は等しい");
		}
		//	大文字小文字を区別せずに等しいかを検証する	
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2とs3はケースを区別しなければ等しい");
		}
		//	s1が空かどうか	
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1はから文字です");
		}
		//	()内を含んでいるか	
		if (s1.contains("Java")) {
			System.out.println("文字列s1は、Javaを含んでいます");
		}
		//	末尾に()内の文字が存在するかを検査	
		if (s1.endsWith("Java")) {
			System.out.println("文字列s1は、Javaが末尾にあります");
		}
		//	最初に()内の文字が出現する場所を調べる	
		System.out.println("文字列s1で最初にJavaが登場する位置は" + s1.indexOf("Java"));
		//	最後に()内の文字が出現する場所を調べる	
		System.out.println("文字列s1で最後にJavaが登場する位置は" + s1.lastIndexOf("Java"));
		//	指定の位置から始まる文字列を任意の長さだけ切り出す	
		System.out.println("文字列s1の4文字目以降は" + s1.substring(3));
		System.out.println("文字列s1の4〜8行目は" + s1.substring(3,8));
		
	}

}
