package be.jeremy.expense.manager.webservice.rest;

import be.jeremy.expense.manager.repository.AccountRepository;
import be.jeremy.expense.manager.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jeremy
 */
@RestController
public class AccountResource {

    @Autowired
    private AccountRepository repository;

    @GetMapping("/account/{id:\\d+}")
    public Account getAccount(@PathVariable Long id) {
        return repository.getAccount(id);
    }
}
