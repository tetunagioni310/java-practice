package sample.account;

public class Main {
	public static void main(String[] args) {
		Account ac = new Account();
		ac.accountNumber = "4649";
		ac.balance = 1592;
		Account ac2 = new Account();
		ac2.accountNumber = "4946";
		ac2.balance = 1259;
		System.out.println(ac2.toString());
		if (ac.equals(ac2) == true) {
			System.out.println("同じ内容です");
		} else {
			System.out.println("違う内容です");
		}
	}
}
