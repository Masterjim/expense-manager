package be.jeremy.manager.expense.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Set;

/**
 * @author Jeremy
 */
@Entity
public class User {

    @Id
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
