package sample;

public class Seinengappi {
	public static void main(String[] args) {	
		introduceOneself();
	}
	
	public static void introduceOneself() {
		String name   =  "タクヤ";
		int	   age    =  34;
		double  height =  178;
		char zodiac =  '馬';
		
		System.out.println("私の名前は" + name + "です。" );
		System.out.println("年齢は" + age + "歳で、身長は" + height + "cm。" );
		System.out.println("干支は" + zodiac + "年です。");
	}
	
}
