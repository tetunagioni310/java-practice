package syou2;

public class Main {
//	public static void main(String[] args) {
//		Pocket<String> p = new Pocket<>();
//		p.put("1192");
//		String s = p.get();
//		System.out.println(s);
//	}
	
//	public static void main(String[] args) {
//		Outer o = new Outer();
//		Outer.Inner ic = o.new Inner();
//		ic.innerMethod();
//		System.out.println(ic);
//	}
	
	public static void main(String[] args) {
		Pocket<Object> pocket = new Pocket<>();
		System.out.println("使い捨てのインスタンスを作りpocketに入れます");
		pocket.put(new Object() {
			String innerField;
			void innerMethod() {}
		});
	}
}
