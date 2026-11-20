
import model.AccountStatus;
import model.AccountType;
import model.BankAccount;
import repository.AccountRepositoryImpl;

void main(String[] args) {
    var repository = new AccountRepositoryImpl();

    BankAccount account = new BankAccount(
null, 12_000, "MAD",
            AccountType.CURRENT_ACCOUNT, AccountStatus.ACTIVATED
    );

    repository.save(account);
    repository.findById(1L).ifPresent(System.out::println);

    System.out.println(repository.search(candidate ->
            "MAD".equals(candidate.getCurrency())
                    && candidate.getStatus() == AccountStatus.ACTIVATED
    ));

    repository.update(new BankAccount(
            account.getId(), 13_000, "MAD",
            account.getType(), account.getStatus()
    ));
    repository.findById(1L).ifPresent(System.out::println);

    repository.deleteById(1L);
    System.out.println(repository.findAll());
}