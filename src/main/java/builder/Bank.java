package builder;

import model.BankAccount;

public class Bank {
    public static BankAccount.AccountBuilder accountBuilder() {
        return new BankAccount.AccountBuilder();
    }
}