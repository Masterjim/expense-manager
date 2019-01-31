package be.jeremy.expense.manager.domain;

import lombok.Getter;

import java.util.Set;

/**
 * @author Jeremy
 */
@Getter
public class User {

    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    private Set<Account> accounts;

}
