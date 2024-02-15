public class Main {

  public static void main(String[] args) {
BankAccount account1 = new BankAccount("1234", 1000.0);
BankAccount account2 = new BankAccount("5678", 500.0);

Bank myBank = new Bank();
myBank.addAccount(account1);
myBank.addAccount(account2);

// Deposit to account1
account1.deposit(200);

// Withdraw from account2
account2.withdraw(100);

BankAccount retrievedAccount = myBank.getAccountById("5678");
System.out.println("Balance: " + retrievedAccount.getBalance());
  }

}
