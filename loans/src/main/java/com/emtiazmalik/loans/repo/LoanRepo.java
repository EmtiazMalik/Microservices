package com.emtiazmalik.loans.repo;

import com.emtiazmalik.loans.model.Loan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepo extends CrudRepository<Loan, Long> {
    List<Loan> findByCustomerIdOrderByStartDtDesc(Long customerId);
}
