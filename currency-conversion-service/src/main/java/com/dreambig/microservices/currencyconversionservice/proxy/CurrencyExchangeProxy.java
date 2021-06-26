package com.dreambig.microservices.currencyconversionservice.proxy;

import com.dreambig.microservices.currencyconversionservice.model.CurrencyConversionValue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "currency-exchange",url = "localhost:8000")
public interface CurrencyExchangeProxy {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionValue retreiveExchangeValue(@PathVariable String from, @PathVariable String to);
}
