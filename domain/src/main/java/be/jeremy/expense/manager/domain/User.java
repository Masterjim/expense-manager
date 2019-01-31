package be.jeremy.expense.manager.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Set;

/**
 * @author Jeremy
 */
@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private Long id;

    private String username;

    private String firstName;

    private String lastName;

    @Transient
    private Set<Account> accounts;

}
