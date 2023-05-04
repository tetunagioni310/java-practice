package sample.rensyu2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	public static void main(String[] main) {
		Set<String> names = new HashSet<String>();
		names.add("北海道");
		
		names.add("青森");
		names.add("秋田");
		names.add("岩手");
		names.add("山形");
		names.add("宮城");
		names.add("福島");
		
		names.add("栃木");
		names.add("神奈川");
		names.add("群馬");
		names.add("埼玉");
		names.add("千葉");
		names.add("東京");
		names.add("茨城");
		
		names.add("新潟");
		names.add("富山");
		names.add("石川");
		names.add("福井");
		names.add("山梨");
		names.add("長野");
		names.add("岐阜");
		names.add("静岡");
		names.add("愛知");
		
		names.add("三重");
		names.add("滋賀");
		names.add("京都");
		names.add("大阪");
		names.add("兵庫");
		names.add("奈良");
		names.add("和歌山");
		
		names.add("鳥取");
		names.add("島根");
		names.add("岡山");
		names.add("広島");
		names.add("山口");
		
		names.add("徳島");
		names.add("香川");
		names.add("愛媛");
		names.add("高知");
		
		names.add("福岡");
		names.add("佐賀");
		names.add("長崎");
		names.add("熊本");
		names.add("大分");
		names.add("宮崎");
		names.add("鹿児島");
		names.add("沖縄");
		
		System.out.println(names.size());
		
		ArrayList<Integer> points = new ArrayList<Integer>();
		points.add(80);
		points.add(67);
		points.add(78);
		
		for (int i : points) {
			System.out.println(i);
		}
		
		Map<String, Integer> souris = new HashMap<String, Integer>();
		souris.put("小泉", 3);
		souris.put("阿部", 6);
		souris.put("森", 2);
		
		for (String key : souris.keySet()) {
			int value = souris.get(key);
			System.out.println(key + "総理の任期は" + value + "年");
		}
		
	}
}
