package be.jeremy.manager.expense.domain;

import java.math.BigDecimal;

/**
 * @author Jeremy
 */
public class Income {

    private final Account account;
    private final BigDecimal amount;

    public Income(Account account, BigDecimal amount) {
        this.account = account;
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
