package syou1;

//public class Account implements Comparable<Account> {
//	int number;
//	int zandaka;
//	
//	public int compareTo(Account obj) {
//		if (this.number < obj.number) {
//			return -1;
//		}
//		
//		if (this.number > obj.number) {
//			return 1;
//		}
//		return 0;
//	}
//}

public class Account {
	private String accountNo;
	private int zandaka;
	private AccountType accountType;
	public Account(String aNo, AccountType aType) {
		this.accountNo = aNo;
		this.accountType = aType;
	}
}