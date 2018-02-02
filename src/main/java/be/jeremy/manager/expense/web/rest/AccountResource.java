package be.jeremy.manager.expense.web.rest;

import be.jeremy.manager.expense.domain.Account;
import be.jeremy.manager.expense.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * @author Jeremy
 */
@RestController
public class AccountResource {

    private static final Logger log = LoggerFactory.getLogger(AccountResource.class);

    @Autowired
    private AccountRepository repository;

    @GetMapping("/account/{id:\\d+}")
    public Account getAccount(@PathVariable Long id) {
        log.debug("Entering getAccount...");
        return repository.getAccount(id);
    }

    @PostMapping("/account")
    public ResponseEntity createAccount(@RequestBody Account account) throws URISyntaxException {
        repository.save(account);

        return ResponseEntity.created(new URI("/account/" + account.getId()))
                .body(account);
    }
}
