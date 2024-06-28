import java.util.ArrayList;
import java.util.List;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private int totalAccount;

    //계좌등록 (계좌번호, 소유자명, 잔액)
    public void addAccount(String accountNo, String name ) {
        Account newAccount = new Account(accountNo,name);
        accounts.add(newAccount);
        totalAccount++;
    }



    //'계좌번호'로 계좌찾기 => 계좌를 출력
    public Account getAccount(String accountNo ) {
        System.out.println("= 해당 계좌번호의 계좌정보 =");
        for(Account account : accounts){
            if(account.getAccountno().equals(accountNo)){
                System.out.println(account.toString());
                return account;
            }
        }
        return null; //계좌가 없는 경우
    }


    /**
     * 기능: '소유자명'으로 계좌찾기 => 계좌 정보를 출력
     * = 해당 소유자명의 계좌 목록 =
     *
     * [계좌번호 :890113, 소유자 명 : 택, 잔액 : 400000]
     * [계좌번호 :0113, 소유자 명 : 택, 잔액 : 0]
     * */
    public List<Account> findAccount(String name) {
        ArrayList<Account> myAccount = new ArrayList<Account>();
        System.out.println("= 해당 소유자명의 계좌 목록 =");
        for(Account account : accounts){
            if(account.getName().equals(name)){
                myAccount.add(account); //해당 소유자명 계좌추가
                System.out.println(account.toString());
            }
        }
        return myAccount; //계좌가 없는 경우
    }

    /**
     * 4. 은행이 가진 계좌목록 보기 ->
     *     = 전체 계좌 목록 =
     *
     * [계좌번호 :10071, 소유자 명 : 백, 잔액 : 0]
     *
     * [계좌번호 :890113, 소유자 명 : 택, 잔액 : 0]
     *
     * [계좌번호 :0113, 소유자 명 : 택, 잔액 : 0]
     *
     * [계좌번호 :987654321, 소유자 명 : 두팔, 잔액 : 0
     */
    public List<Account> getAccounts() {
        System.out.println("= 전체 계좌 목록 =");
        for (Account account : accounts){
            System.out.println("[" + "계좌번호 :" + account.getAccountno() +
                            ", 소유자 명 : " + account.getName() +
                            ", 잔액 : " + account.getBalance() +
                            "]"
                    );
        }
        return accounts;
    }

    //5. 총계좌수를 반환
    public int getTotalAccount(){
        return totalAccount;
    }

}

