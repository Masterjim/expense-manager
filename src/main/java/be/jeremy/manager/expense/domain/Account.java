package be.jeremy.manager.expense.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.List;

/**
 * @author Jeremy
 */
@Entity
public class Account {

    @Id
    private Long id;
    private String name;
    private String description;

    @Transient
    private List<Income> incomes;
    @Transient
    private List<Expense> expenses;

    public Account() {
    }

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

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Income> getIncomes() {
        return incomes;
    }

    public void setIncomes(List<Income> incomes) {
        this.incomes = incomes;
    }

    public List<Expense> getExpenses() {
        return expenses;
    }

    public void setExpenses(List<Expense> expenses) {
        this.expenses = expenses;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
