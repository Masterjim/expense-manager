package be.jeremy.expense.manager.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Jeremy
 */
public class Income extends MoneyStream {

    public Income(Account account, LocalDateTime date, BigDecimal amount) {
        super(account, date, amount);
    }

}
