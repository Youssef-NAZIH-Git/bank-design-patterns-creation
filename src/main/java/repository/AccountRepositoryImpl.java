package repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import model.BankAccount;

public class AccountRepositoryImpl implements AccountRepository {
    private final Map<Long, BankAccount> accounts = new HashMap<>();
    private long accountCount;

    @Override
    public BankAccount save(BankAccount account) {
        long id = ++accountCount;
        account.setId(id);
        accounts.put(id, account);
        return account;
    }

    @Override
    public List<BankAccount> findAll() {
        return new ArrayList<>(accounts.values());
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        return Optional.ofNullable(accounts.get(id));
    }

    @Override
    public List<BankAccount> search(Predicate<BankAccount> predicate) {
        return accounts.values().stream().filter(predicate).toList();
    }

    @Override
    public BankAccount update(BankAccount account) {
        accounts.put(account.getId(), account);
        return account;
    }

    @Override
    public void deleteById(Long id) {
        accounts.remove(id);
    }
}