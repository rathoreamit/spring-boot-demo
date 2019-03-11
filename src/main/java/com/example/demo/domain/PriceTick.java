package com.example.demo.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

@JsonDeserialize(builder = PriceTick.Builder.class)
public class PriceTick {

    private String symbol;
    private double price;
    private long utcTime;

    private PriceTick(String symbol, double price, long utcTime) {
        this.symbol = symbol;
        this.price = price;
        this.utcTime = utcTime;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public long getUtcTime() {
        return utcTime;
    }

    @JsonPOJOBuilder
    public static class Builder {
        private String symbol;
        private double price;
        private long utcTime;

        public Builder withSymbol(String symbol) {
            this.symbol = symbol;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder withUtcTime(long time) {
            this.utcTime = time;
            return this;
        }

        public PriceTick build() {
            return new PriceTick(symbol, price, utcTime);
        }
    }
}
