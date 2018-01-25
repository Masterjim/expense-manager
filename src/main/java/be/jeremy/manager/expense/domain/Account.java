package be.jeremy.manager.expense.domain;

/**
 * @author Jeremy
 */
public class Account {

    private final Long id;
    private final String name;
    private final String description;

    public Account(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
