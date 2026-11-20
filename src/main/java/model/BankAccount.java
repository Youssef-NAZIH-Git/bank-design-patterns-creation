package model;

public class BankAccount {
    private Long id;
    private double balance;
    private String currency;
    private AccountType type;
    private AccountStatus status;

    public BankAccount() {
    }

    public BankAccount(Long id, double balance, String currency,
                       AccountType type, AccountStatus status) {
        this.id = id;
        this.balance = balance;
        this.currency = currency;
        this.type = type;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "BankAccount{id=%s, balance=%s, currency=%s, type=%s, status=%s}"
                .formatted(id, balance, currency, type, status);
    }









    public static class AccountBuilder {
        private final BankAccount account = new BankAccount();

        public AccountBuilder id(Long id) {
            account.id = id;
            return this;
        }

        public AccountBuilder balance(double balance) {
            account.balance = balance;
            return this;
        }

        public AccountBuilder currency(String currency) {
            account.currency = currency;
            return this;
        }

        public AccountBuilder type(AccountType type) {
            account.type = type;
            return this;
        }

        public AccountBuilder status(AccountStatus status) {
            account.status = status;
            return this;
        }

        public BankAccount build() {
            return account;
        }
    }
}