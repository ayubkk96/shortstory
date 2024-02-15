import account.BankAccount;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankAccountTest {

    @Test
    public void testAccountCreation() {

        BankAccount account = new BankAccount("1", 100);
        assertEquals(100, account.getBalance(), 0);

    }

    @Test
    public void testDepositIncreasesBalance() {
        BankAccount account = new BankAccount("1", 100);
        account.deposit(50);
        assertEquals(150, account.getBalance(), 0);
    }

    @Test
    public void testAccountIdSetCorrectly() {
        BankAccount account = new BankAccount("123", 100);
        assertEquals("123", account.getId());
    }

    @Test
    public void testWithdrawDecreasesBalance() {
        BankAccount account = new BankAccount("1", 100);
        account.withdraw(100);
        assertEquals(0, account.getBalance(), 0);
    }
}
