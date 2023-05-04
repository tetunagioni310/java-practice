package syou1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book> {
	private String title;
	private Date   publishDate;
	private String comment;
	
	public Book(String title, String publishDate, String comment) {
		try {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		this.title		 = title;
		this.publishDate = f.parse(publishDate);
		this.comment 	 = comment;
		} catch (ParseException e) {
			System.out.println("エラーが発生しました");
		}
	}
	
	public Book() {
		try {
		SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd");
		this.title = "Java入門";
		Date d = f.parse("2011/10/07");
		this.publishDate = d;
		this.comment = "スッキリわかる";
		} catch (ParseException e) {
			System.out.println("エラーが発生しました");
		}
	}
	
	public Date getPublishDate() {
		return this.publishDate;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (!(o instanceof Book)) return false;
		Book b = (Book)o;
		if (!this.title.equals(b.title)) {
			return false;
		}
		if (!this.publishDate.equals(b.publishDate)) {
			return false;
		}
		return true;
	}
	
	//　配列の中身をハッシュ値で比較する
	public int hashCode() {
		return Objects.hash(this.title, this.publishDate, this.comment);
	}
	
	//	古い順を自然順序とする
	public int compareTo(Book obj) {
		//自分自身の方が古い場合		
		if (this.publishDate.before(obj.publishDate)) {
			return -1;
		}
		//	自分自身の方が新しい場合	
		if (obj.publishDate.before(this.publishDate)) {
			return 1;
		}
		//	発行日が同じ場合	
		return 0;
		//  上記の様にオーバーライドしなくてもDateクラスで定義されているのでオーバーライドする必要はない
		//  DateクラスでcompareToメソッドが定義されている為だと思われる
		//	return this.publishDate.compareTo(obj.publishDate);
	}
	
	public Book clone() {
		Book result = new Book();
		result.title 	   = this.title;
		result.publishDate = (Date)this.publishDate.clone();
		result.comment	   = this.comment;
		return result;
	}
}
