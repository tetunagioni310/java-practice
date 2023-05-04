package sample;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {
//		問1
		StringBuilder s = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			s.append(i + ",");
		}
		String a = s.toString();
		System.out.println(a);
		
//		問2
		String folder = "c:¥javadev¥"; String file = "readme.txt";
		renketu(folder,file);
		
//		問3
		String name = "UABC";
		isValidName(name);
		
//		問4
//		Date型で現在時刻をJST取得
		Date now = new Date();
		
//		getInstanceメソッドを呼ぶことで現在の日付と時間に初期化された状態で
//		オブジェクトを返す
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		
		int day = c.get(Calendar.DAY_OF_MONTH);
		day += 100;
		c.set(Calendar.DAY_OF_MONTH,day);
		System.out.println("年：" + c.get(Calendar.YEAR));
        System.out.println("月：" + c.get(Calendar.MONTH)); 
        System.out.println("日：" + c.get(Calendar.DATE));
//      1月を0と扱うため、月が3と表示される
		
		Date d = c.getTime();
		System.out.println(d);
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		fに格納されているフォーマットでdを表示する
		System.out.println(f.format(d));
		
//		問5
//		ZoneDateTimeの生成して現在時刻を取得する
		LocalDate d1 = LocalDate.now();
		LocalDate d1p = d1.plusDays(100);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		String str = d1p.format(fmt);
		System.out.println(str);
		
		
	}
	
	public static void renketu(String folder, String file) {
		StringBuilder sb = new StringBuilder();
		if (folder.endsWith("¥")) {
			sb.append(folder + file);
		} else {
			sb.append(folder + "¥" + file);
		}
		String s = sb.toString();
		System.out.println(s);
	}
	
	public static void isValidName(String name) {
		if (name.matches("U[A-Z]{3}")) {
			System.out.println("正しい");
		} else {
			System.out.println("間違っています");
		}
	}
}