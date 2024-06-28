public class Bank {
    private Account[] accounts = new Account[];
    private int totalAccount;

    //계좌등록 (계좌번호, 소유자명, 잔액)
    public void addAccount(String accountNo, String name ) {


        return totalAccount;
    }



    //'계좌번호'로 계좌찾기 => 계좌를 출력
    public Account getAccount(String accountNo ) {
        return totalAccount;
    }

    //'소유자명'으로 계좌찾기 => 계좌 정보를 출력
    /**
     * = 해당 소유자명의 계좌 목록 =
     *
     * [계좌번호 :890113, 소유자 명 : 택, 잔액 : 400000]
     * [계좌번호 :0113, 소유자 명 : 택, 잔액 : 0]
     * */
    public Account[] findAccount(String name) {
        return totalAccount;
    }

    // 4. 계좌목록 보기 ->
    /* return
    = 해당 소유자명의 계좌 목록 =

    [계좌번호 :890113, 소유자 명 : 택, 잔액 : 400000]
    [계좌번호 :0113, 소유자 명 : 택, 잔액 : 0]
    * */
    public Account[] getAccounts() {

        return accounts;
    }



}

