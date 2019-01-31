package be.jeremy.expense.manager.domain;

import lombok.Builder;
import lombok.Getter;

/**
 * @author Jeremy
 */
@Getter
@Builder
public class Account {

    private final Long id;

    private final String name;

    private final String description;

}
