package sample.rensyu9;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("/Users/takuyakudo/data.txt");
			fw.write('そ');
			fw.write('れ');
			fw.write('で');
			fw.write('は');
		} catch (Exception e) {
			System.out.println("例外が発生しました");
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				;
			}
		}
	}
}
