package com.example.demo.controller;

import com.example.demo.domain.PriceTick;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PricingController {

    @GetMapping("/price/{symbol}")
    public PriceTick price(@PathVariable String symbol) {
        PriceTick.Builder builder = new PriceTick.Builder();
        return builder.withSymbol(symbol).withPrice(Math.random()).withUtcTime(System.currentTimeMillis()).build();
    }
}
