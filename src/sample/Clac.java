package sample;

public class Clac {
	public static void main(String[] main) {
		double trianglearea = clactriangleArea(10.0, 5.0);
		double circlearea = clacCircleArea(5.0);
		
		System.out.println("三角形の面積は" + trianglearea + "平方cmです" );
		System.out.println("円の面積は" + circlearea + "平方cmです");
	}
	
	public static double clactriangleArea(double bottom, double height) {
		double area = (bottom * height) / 2;
		return area;
	}
	
	public static double clacCircleArea(double radius) {
		double area = radius * radius * 3.14;
		return area;
	}
}
