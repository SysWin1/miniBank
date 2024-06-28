import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Bank bank = new Bank();
        bank.addAccount("1","가");
        bank.addAccount("2","가");
        bank.addAccount("3","나");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        OUT:
        while(true){
            System.out.println("1. 계좌 생성");
            System.out.println("2. 계좌 정보조회");
            System.out.println("3. 소유자별 계좌 목록 조회");
            System.out.println("4. 전계좌 조회");
            System.out.println("5. 총 계좌수 반환");
            System.out.println("6. 입금");
            System.out.println("7. 출금");
            System.out.println("8. 잔액조회");
            System.out.println("9. 거래내역 조회");
            System.out.println("0. 업무 종료");
            System.out.print("진행하고자 하는 업무를 입력해 주세요: ");
            int work = Integer.parseInt(br.readLine());
            switch (work) {
                case 0:
                    System.out.println("업무를 종료합니다.");
                    break OUT;
                case 1:
                    System.out.println("생성할 계좌 번호를 입력하세요: ");
                    String accountNo = br.readLine();
                    System.out.println("고객 명을 입력하세요: ");
                    String name = br.readLine();
                    bank.addAccount(accountNo,name);
                    break;
                case 2:
                    System.out.println("조회할 계좌 번호를 입력하세요: ");
                    String accountInfo = br.readLine();
                    Account account = bank.getAccount(accountInfo);
                    System.out.println(account.toString());
                    break;
                case 3:
                    System.out.println("고객명을 입력하세요: ");
                    String findforName = br.readLine();
                    bank.findAccount(findforName);
                    break;
                case 4:
                    bank.getAccounts();
                    break;
                case 5:
                    System.out.println("총 계좌 수는 "+bank.getTotalAccount() + "입니다.");
                    break;
                case 6:
                    System.out.println("입금할 계좌 번호를 입력하세요: ");
                    String depositAccount = br.readLine();
                    System.out.println("입금할 금액을 입력해 주세요: ");
                    Long depositAmount = Long.valueOf(br.readLine());
                    Account accountd = bank.getAccount(depositAccount);
                    long balance = accountd.getBalance();
                    accountd.deposit(depositAmount);
                    break;
                case 7:
                    System.out.println("출금할 계좌 번호를 입력하세요: ");
                    String withdrawAccount = br.readLine();
                    System.out.println("출금할 금액을 입력해 주세요: ");
                    Long withdrawAmount = Long.valueOf(br.readLine());
                    Account account1 = bank.getAccount(withdrawAccount);
                    long balance1 = account1.getBalance();
                    account1.withdraw(withdrawAmount);
                    break;
                case 8:
                    System.out.println("잔액 조회할 계좌 번호를 입력하세요: ");
                    String balanceInfo = br.readLine();
                    Account balanceAccount = bank.getAccount(balanceInfo);
                    System.out.println("현재 잔액은 "+balanceAccount.getBalance() + "원 입니다.");
                    break;
                case 9:
                    System.out.println("거래내역 조회할 계좌 번호를 입력하세요: ");
                    String transactionInfo = br.readLine();
                    Account transactionAccount = bank.getAccount(transactionInfo);
                    List<Transaction> transactions = transactionAccount.getTransactions();
                    for(Transaction t:transactions){
                        System.out.println(t.toString());
                    }
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하였습니다. 다시 입력해 주세요");
            }
        }
    }
}