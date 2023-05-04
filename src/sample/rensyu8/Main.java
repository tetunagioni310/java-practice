package sample.rensyu8;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileReader fw = null;
		try {
			fw = new FileReader("/Users/takuyakudo/data.txt");
			int input = fw.read();
			while (input != -1) {
				System.out.print((char)input);
				input = fw.read();
			}
			
		} catch (Exception e) {
			System.out.println("例外が発生しました");
		} finally {
		  if (fw != null) {
			  try {
			  fw.close();
			  } catch (IOException e) {
			  ;
			  }
			} 
		}
	}
}
