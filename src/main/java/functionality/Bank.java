package functionality;

import account.BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public BankAccount getAccountById(String id) {

        if (id == null) {
            return null;
        }

        for (BankAccount account : accounts) {
            if (account.getId().equals(id)) {
                return account;
            }
        }

        return null;
    }
}
