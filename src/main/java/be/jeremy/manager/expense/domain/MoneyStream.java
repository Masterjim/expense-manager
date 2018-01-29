package be.jeremy.manager.expense.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Jeremy
 */
public abstract class MoneyStream {

    private final Account account;
    private final LocalDateTime date;
    private final BigDecimal amount;

    public MoneyStream(Account account, LocalDateTime date, BigDecimal amount) {
        this.account = account;
        this.date = date;
        this.amount = amount;
    }
}
