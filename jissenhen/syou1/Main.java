package syou1;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	public static void main(String[] args) {
//		List<Hero> list = new ArrayList<>();
//		Hero h1 = new Hero("ミナト");
//		list.add(h1);
//		System.out.println("要素数=" + list.size());
//		h1 = new Hero("ミナト");
//		list.remove(h1);
//		System.out.println("要素数=" + list.size());
//		
//		int[] a = {8, 1, 2, 3, 4, 5};
//		int[] b = {1, 2, 3, 4, 5};
//		
//		
//		System.out.println("誤った判定：" + a.equals(b));
//		System.out.println("正しい判定：" + Arrays.equals(a, b));
//		
//		//	インスタンスの要約	
//		Set<Hero> list2 = new HashSet<>();
//		Hero h2 = new Hero("ミコト");
//		list2.add(h2);
//		System.out.println("要素数=" + list2.size());
//		h2 = new Hero("ミコト");
//		list2.remove(h2);
//		System.out.println("要素数=" + list2.size());
//		
//		List<Integer> list3 = new ArrayList<Integer>();
//		list3.add(30);
//		list3.add(20);
//		list3.add(10);
//		list3.add(15);
//		list3.add(9);
//		
//		for (int i : list3) {
//		System.out.println(i);
//		}
//		
//		Collections.sort(list3);
//		
//		for (int i : list3) {
//		System.out.println(i);
//		}
//		
//		List<Account> list4 = new ArrayList<>();
//		Account a1 = new Account();
//		a1.number = 1;
//		a1.zandaka = 15000;
//		Account a2 = new Account();
//		a2.number = 2;
//		a2.zandaka = 10000;
//		Account a3 = new Account();
//		a3.number = 3;
//		a3.zandaka = 20000;
//		Account a4 = new Account();
//		a4.number = 4;
//		a4.zandaka = 9000;
//		
//		list4.add(a1);
//		list4.add(a2);
//		list4.add(a3);
//		list4.add(a4);
//		
//		for (Account i : list4) {
//			System.out.println(i.number + ":" + i.zandaka);
//			}
//		
//		Collections.sort(list4, new ZandakaComparator());
//		
//		for (Account i : list4) {
//			System.out.println(i.number + ":" + i.zandaka);
//			}
//		
//		Hero h3 = new Hero("ミナト", 50);
//		Sword s1 = new Sword("はがねの剣");
//		h3.setSword(s1);
//		
//		System.out.println("装備：" + h3.getSword().getName());
//		System.out.println("clone()で複製します");
//		Hero h4 = h3.clone();
//		
//		System.out.println("コピー元の勇者の剣の名前を変えます");
//		h3.getSword().setName("ひのきの棒");
//		System.out.println("コピー元とコピー先の勇者の装備を表示します");
//		System.out.println("コピー元：" + h3.getSword().getName() 
//				+ "／コピー先：" + h4.getSword().getName());
		
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		List<Book> list = new ArrayList<>();
		Book b1 = new Book();
		Book b2 = new Book("Python入門", "2019/06/11", "カレーが食べたくなる");
		Book b3 = new Book("C言語入門", "2018/06/21", "ポインタも自由自在");
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		for (Book i : list) {
			System.out.println("発行日：" + f.format(i.getPublishDate()) + " " + i.getTitle());
		}
		
		System.out.println("------------------------");
		
		Collections.sort(list);
		
		for (Book i : list) {
			System.out.println("発行日：" + f.format(i.getPublishDate()) + " " + i.getTitle());
		}
		
		System.out.println("------------------------");
		Collections.sort(list, new TitleComparator());
		
		for (Book i : list) {
			System.out.println("発行日：" + f.format(i.getPublishDate()) + " " + i.getTitle());
		}
		
		
		}
}
