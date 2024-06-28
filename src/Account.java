import java.util.ArrayList;
import java.util.List;

public class Account {
	private String accountNo;
	private String name;
	private long balance;
	private List<Transaction> transactions = new ArrayList<>();

	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
	}

	public void deposit(long amount) {
		TransactionDate tsd = new TransactionDate();
		Transaction ts = new Transaction(tsd.getDate(), tsd.getTime(), "입금", amount, balance);
		if (amount > 0) {
			balance += amount;
			System.out.println();
			System.out.println(amount + "원 입금하셨습니다.");
			System.out.println("현재 잔액은" + balance + "입니다.");
			transactions.add(ts);
		} else {
			System.out.println("금액오류! 다시 입력해주세요.");
		}

	}

	public void withdraw(long amount) {
		TransactionDate tsd = new TransactionDate();
		Transaction ts = new Transaction(tsd.getDate(), tsd.getTime(), "인출", amount, balance);
		if (balance >= amount) {
			balance -= amount;
			System.out.println();
			System.out.println(amount + "원 인출하셨습니다.");
			System.out.println("현재 잔액은" + balance + "입니다.");
			transactions.add(ts);
		} else {
			System.out.println("잔액이 부족합니다.");
		}
	}

	public String getName() {
		return name;
	}

	public String getAccountno() {
		return accountNo;
	}

	public long getBalance() {
		return balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	@Override
	public String toString() {
		return "[계좌번호 : " + accountNo + ", 소유자 명 : " + name + ", 잔액 : " + balance + "]";
	}

}
