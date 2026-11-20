import model.AccountStatus;
import model.AccountType;
import model.BankAccount;

void main(String[] args) {
    BankAccount account =
            new BankAccount(1L,
                    12_000,
                    "MAD",
                    AccountType.CURRENT_ACCOUNT,
                    AccountStatus.ACTIVATED
            );

    System.out.println(account);
}