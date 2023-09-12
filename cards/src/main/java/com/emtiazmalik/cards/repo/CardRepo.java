package com.emtiazmalik.cards.repo;

import com.emtiazmalik.cards.model.Cards;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CardRepo extends CrudRepository<Cards, Long> {
    List<Cards> findByCustomerId(Long customerId);
}
