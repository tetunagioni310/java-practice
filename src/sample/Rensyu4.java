package sample;

public class Rensyu4 {
	public static void main(String[] args) {
		int[] 	  points    = new int[4];
		double[]  weights 	= new double[5];
		boolean[] answers 	= new boolean[3];
		String[]  names   	= new String[3];
		int[] 	  moneyList = { 121902, 8302, 55100 };
		
		for (int value :points) {
			System.out.print(value + " ");
		}
		System.out.println("");
		
		for (int i = 0; i < moneyList.length; i++) {
			System.out.print(moneyList[i] + " ");
		}
		System.out.println("");
		
		for (int m :moneyList ) {
			System.out.print(m + " ");
		}
	}
}
