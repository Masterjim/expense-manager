package be.jeremy.expense.manager.domain;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Jeremy
 */
@Getter
public class Expense extends MoneyStream {

    private final String to;

    @Builder
    public Expense(Account account,
                   LocalDateTime date,
                   BigDecimal amount,
                   String description,
                   String to) {
        super(account, date, amount, description);
        this.to = to;
    }

}
