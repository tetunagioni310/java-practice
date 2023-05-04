package sample.daytime;
import java.util.Calendar;
import java.util.Date;

public class Main {
	public static void main(String[] args) {
		// オブジェクトを生成	
		Calendar c = Calendar.getInstance();
		// 6つのint値からDateインスタンスを生成
		// まとめて設定	
		c.set(2019,8,22,1,23,45);
		//　月を10月に設定。1月が0に設定されているため9を入力
		c.set(Calendar.MONTH, 9);
		//	カレンダーから現在の日付と時刻をDateオブジェクトとして取得する
		Date d = c.getTime();
		System.out.println(d);
		Date now = new Date();
		// 現在日時をcにセット
		c.setTime(now);
		//年を取り出す
		int y = c.get(Calendar.YEAR);
		System.out.println("今年は" + y + "年です");
	}
}
