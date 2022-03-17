import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tddClass.Account;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(100);
        assertEquals(100, funmiAccount.getBalance());
    }

    @Test
    public void depositTwiceTest() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(500);
        funmiAccount.deposit(400);
        assertEquals(500 + 400, funmiAccount.getBalance());

    }

    @Test
    @DisplayName("Test the negative deposit will not work")
    public void negativeDepositTest() {
        Account funmiAccount = new Account();
        funmiAccount.deposit(1000);
        funmiAccount.deposit(-500);
        assertEquals(1000, funmiAccount.getBalance());
    }

@Test
    public void canGetWithdrawal(){
        Account funmiAccount = new Account();
    funmiAccount.deposit (4000);
    funmiAccount.withdrawal(3000);
    assertEquals(1000, funmiAccount.getBalance());
}
@Test
    public void cannotWithdrawMoreThanTheAccountBalance(){
    Account funmiAccount = new Account();
    funmiAccount.deposit (4000);
    funmiAccount.withdrawal(9000);
    assertEquals(4000, funmiAccount.getBalance());
}


@Test
public void mustRemain1000(){
    Account funmiAccount = new Account();
    funmiAccount.deposit (2000);
    funmiAccount.withdrawal(1100);
    assertEquals(2000, funmiAccount.getBalance());
}
}
