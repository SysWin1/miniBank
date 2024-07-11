package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public class Transaction {
    private String transactionDate;
    private String transactionTime;
    private String kind;
    private long amount;
    private long balance;

    @Override
    public String toString() {
        return "[거래금액 : "+amount+", 잔액 : "+balance+" / "+transactionDate+" "+transactionTime+"]";
    }
}
