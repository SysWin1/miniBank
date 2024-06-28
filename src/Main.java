import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Bank bank;

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
            System.out.println();
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                default:
                    System.out.println("잘못된 번호를 입력하였습니다. 다시 입력해 주세요");
            }
        }
    }
}