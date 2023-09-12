package com.emtiazmalik.accounts.repos;

import com.emtiazmalik.accounts.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends CrudRepository<Account, Long> {
}
