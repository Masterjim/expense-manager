package be.jeremy.manager.expense.domain;

import java.util.Set;

/**
 * @author Jeremy
 */
public class User {

    private Long id;
    private String username;
    private String firstName;
    private String lastName;

    private Set<Account> accounts;

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }
}
