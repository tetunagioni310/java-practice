package sample.account;

public class Account {
	String accountNumber;
	int balance;
	
	//	文字列表現のメソッド
	public String toString() {
		return "¥¥" + this.balance + "(口座番号:" + this.accountNumber + ")";
	}
	
	//	等価判定のメソッド
	public boolean equals(Object o) {
		if (this == o) { return true; }
		if (o instanceof Account) {
			Account a = (Account)o;
			if (this.accountNumber.trim().equals(a.accountNumber.trim())) {
				return true;
			}
		}
		return false;
	}
}
