package be.jeremy.manager.expense.repository;

import be.jeremy.manager.expense.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

/**
 * @author Jeremy
 */
@Repository
public class AccountRepository {

    @Autowired
    private EntityManager entityManager;

    public Account getAccount(Long id) {
        return entityManager.find(Account.class, id);
    }

    @Transactional
    public void save(Account account) {
        entityManager.persist(account);
    }
}
