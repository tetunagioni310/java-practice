package syou3;
import static syou3.KeyType.*;

import java.util.Optional;



public class Main {
	public static Optional<String> decorate(String s, char c) {
		String r;
		if (s == null || s.length() == 0) {
			r = null;
		} else {
			r = c + s +c;
		}
		return Optional.ofNullable(r);
	}
	
	public static void main(String[] args) {
//		Optional<String> s = decorate("ラミィ", '*');
//		System.out.println(s.orElse("nullのため処理できません"));
		
		StrongBox<String> t = new StrongBox<String>(PADLOCK);
		t.put("雪花ラミィ");
		String s = t .get();
		System.out.println(s);
	}
}
