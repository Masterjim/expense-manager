/*
 * Copyright (c) eHealth
 */
package be.jeremy.expense.manager.repository;

import be.jeremy.expense.manager.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Jeremy Vanpé (eh056)
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
