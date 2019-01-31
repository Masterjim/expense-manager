package be.jeremy.expense.manager.domain;

import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Jeremy
 */
@Getter
abstract class MoneyStream {

    private final Account account;

    private final LocalDateTime date;

    private final BigDecimal amount;

    private final String description;

    public MoneyStream(Account account, LocalDateTime date, BigDecimal amount, String description) {
        this.account = account;
        this.date = date;
        this.amount = amount;
        this.description = description;
    }
}
