package com.dreambig.microservices.controller;

import com.dreambig.microservices.entity.CurrencyExchange;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.dreambig.microservices.dao.CurrencyExchangeRepository;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private CurrencyExchangeRepository repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyExchange retreiveExchangeValue(@PathVariable String from, @PathVariable String to) {

        CurrencyExchange cur = repository.findByFromAndTo(from, to);
        if (null == cur) {
            throw new RuntimeException("Details not found");
        }
        cur.setEnvironment(environment.getProperty("local.server.port"));

        return cur;
    }
}
