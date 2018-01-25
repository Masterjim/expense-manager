package be.jeremy.manager.expense.repository;

import be.jeremy.manager.expense.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jeremy
 */
@Repository
public class AccountRepository {

    public static Map<Long, Account> fakeRepository = new HashMap<Long, Account>(){{
        put(1L, new Account(1L, "MyAccount", "This is my account"));
    }};

    public Account getAccount(Long id) {
        return fakeRepository.get(id);
    }
}
