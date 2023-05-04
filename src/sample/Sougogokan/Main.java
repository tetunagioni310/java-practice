package sample.Sougogokan;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main {
	public static void main(String[] args) throws Exception {
		//  y=年　M=月 d=日 H=時 m=分 s=秒
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// 文字列を解析してDateインスタンスを生成
		Date d = f.parse("2020/09/22 01:23:45");
		System.out.println(d);
		// Dateインスタンスから文字列を生成。現在時刻取得
		Date now = new Date();
		String s = f.format(now);
		System.out.println("現在は" + s + "です");
		
		// 現在時刻を取得
		Instant i1 = Instant.now();
		System .out.println(i1);
		
		//　Instantとlong値との相互変換
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l = i2.toEpochMilli();
		System.out.println(l);
		
		// ZonedDateTimeの生成
		// 現在時刻を取得
		ZonedDateTime z1 = ZonedDateTime.now();
		System.out.println(z1);
		// 東京時間2020年1月2日3時4分5秒6ナノ秒を指定して取得
		ZonedDateTime z2 = ZonedDateTime.of
				(2020, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		
		// InstantとZonedDateTimeの相互変換
		// Instant(UTC)に変換する
		Instant i3 = z2.toInstant();
		System.out.println(i3);
		// zoneをヨーロッパ・ロンドンに指定
		ZonedDateTime z3 = i3.atZone( ZoneId.of("Europe/London"));
		System.out.println(z3);
		
		//　ZonedDateTimeの利用方法
		System.out.println("東京：" + z2.getYear() + z2.getMonth() + z2.getDayOfMonth());
		System.out.println("ロンドン：" + z3.getYear() + z3.getMonth() + z3.getDayOfMonth());
		if (z2.isEqual(z3)) {
			System.out.println("これらは同じ瞬間を指しています");
		}
	}
}
