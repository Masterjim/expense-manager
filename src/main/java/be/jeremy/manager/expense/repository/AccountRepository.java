package be.jeremy.manager.expense.repository;

import be.jeremy.manager.expense.domain.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jeremy
 */
@Repository
public class AccountRepository {

    private static final Logger log = LoggerFactory.getLogger(AccountRepository.class);

    public static Map<Long, Account> fakeRepository = new HashMap<Long, Account>(){{
        put(1L, new Account(1L, "MyAccount", "This is my account"));
    }};

    public Account getAccount(Long id) {
        log.info("Entering int getAccount...");

        return fakeRepository.get(id);
    }
}
