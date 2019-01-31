package be.jeremy.expense.manager.repository;

import be.jeremy.expense.manager.domain.Account;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Jeremy
 */
@Repository
@Slf4j
public class AccountRepository {

    private static final Account fakeAccount = Account.builder()
            .id(1L)
            .name("MyAccount")
            .description("This is my account")
            .build();

    private static Map<Long, Account> fakeRepository = new HashMap<Long, Account>(){{
        put(fakeAccount.getId(), fakeAccount);
    }};

    public Account getAccount(Long id) {
        log.info("Entering int getAccount...");

        return fakeRepository.get(id);
    }
}
