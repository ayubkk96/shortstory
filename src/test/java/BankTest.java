import account.BankAccount;
import functionality.Bank;
import junit.framework.TestCase;

import static org.mockito.Mockito.*;

public class BankTest extends TestCase {

    private Bank bank;

    @Override
    protected void setUp() {
        bank = mock(Bank.class);
    }

    public void testCreateBank() {
        bank = new Bank();
        assertNotNull(bank);
    }

    public void testGetBankAccountById() {

        // Mock the account to return
        BankAccount mockAccount = mock(BankAccount.class);
        when(mockAccount.getId()).thenReturn("account1");

        // Mock the bank to return the account
        Bank bank = mock(Bank.class);
        when(bank.getAccountById("account1")).thenReturn(mockAccount);

        BankAccount account = bank.getAccountById("account1");

        // Verify mocks
        verify(bank).getAccountById("account1");

        assertEquals("account1", account.getId());

    }

}
