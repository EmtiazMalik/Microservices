package com.emtiazmalik.accounts.repos;

import com.emtiazmalik.accounts.models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, Long> {
}
