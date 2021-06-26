package com.dreambig.microservices.dao;

import com.dreambig.microservices.entity.CurrencyExchange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange,Long> {

    public CurrencyExchange findByFromAndTo(String from, String to);
}
