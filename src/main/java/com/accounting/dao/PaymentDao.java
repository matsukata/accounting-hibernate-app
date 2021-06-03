package com.accounting.dao;

import com.accounting.model.Payment;

import java.math.BigDecimal;
import java.util.List;

public interface PaymentDao {
    void save(Payment payment);

    Payment findById(Long id);

    Payment findBySum(BigDecimal sum);

    void update(Payment payment);

    void remove(Payment payment);

    List<Payment> findAll();
}
