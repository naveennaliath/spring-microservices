package com.dreambig.microservices.entity;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class CurrencyExchange {

    @Id
    private Long id;

    @Column(name="currency_from")
    private String from;

    @Column(name="currency_to")
    private String to;

    private BigDecimal conversionMultiple;

    private String environment;
}
