package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String accountNo;
    private String name;
    private long balance;
    private List<Transaction> transactions = new ArrayList<>();

    public Account(String accountNo, String name) {}
    public void deposit(long amount) {
        TransactionDate tsd = new TransactionDate();
        Transaction ts = Transaction.builder()
                .transactionDate(tsd.getDate())
                .transactionTime(tsd.getTime())
                .kind("입금")
                .amount(amount)
                .build();
        if (amount > 0) {
            balance += amount;
            System.out.println();
            System.out.println(amount + "원 입금하셨습니다.");
            System.out.println("현재 잔액은" + balance + "입니다.");
            transactions.add(ts);
        } else {
            System.out.println("금액오류! 처음으로 돌아갑니다");
        }

    }

    public void withdraw(long amount) {
        TransactionDate tsd = new TransactionDate();
        Transaction ts = Transaction.builder()
                .transactionDate(tsd.getDate())
                .transactionTime(tsd.getTime())
                .kind("인출")
                .amount(amount)
                .build();
        if (balance >= amount) {
            balance -= amount;
            System.out.println();
            System.out.println(amount + "원 인출하셨습니다.");
            System.out.println("현재 잔액은" + balance + "입니다.");
            transactions.add(ts);
        } else {
            System.out.println("잔액이 부족합니다. 처음으로 돌아갑니다.");
        }
    }

    @Override
    public String toString() {
        return "[계좌번호 : " + accountNo + ", 소유자 명 : " + name + ", 잔액 : " + balance + "]";
    }

}
