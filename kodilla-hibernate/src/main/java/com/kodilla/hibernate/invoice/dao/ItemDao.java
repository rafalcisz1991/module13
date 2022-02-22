package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Item;
import org.springframework.data.repository.CrudRepository;

import java.math.BigDecimal;
import java.util.List;

public interface ItemDao extends CrudRepository<Item, Integer> {
    List<Item> findByValue(BigDecimal value);
}
