package syou2;

public class Outer {
//	int outerMember = 2;
//	//	メソッド
//	void outerMethod() {
//		int a = 10;
//		//	ローカルクラス	
//		class Inner {
//			public void innerMethod() {
//				System.out.println("innerMethodです");
//				System.out.println(outerMember + a);
//			}
//		}
//		Inner ic = new Inner();
//		ic.innerMethod();
//	}
	int outerField; static int outerStaticField;
	class Inner {
		void innerMethod() {
			outerStaticField = 10;
		}
	}
	void outerMethod() {
		Inner ic = new Inner();
	}
}
