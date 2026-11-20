package repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import model.BankAccount;

public interface AccountRepository {
    BankAccount save(BankAccount account);

    List<BankAccount> findAll();

    Optional<BankAccount> findById(Long id);

    List<BankAccount> search(Predicate<BankAccount> predicate);

    BankAccount update(BankAccount account);

    void deleteById(Long id);
}