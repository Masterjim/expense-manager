package be.jeremy.expense.manager.domain;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author Jeremy
 */
@Getter
public class Income extends MoneyStream {

    private final String from;

    @Builder
    public Income(Account account,
                  LocalDateTime date,
                  BigDecimal amount,
                  String description,
                  String from) {
        super(account, date, amount, description);
        this.from = from;
    }
}
