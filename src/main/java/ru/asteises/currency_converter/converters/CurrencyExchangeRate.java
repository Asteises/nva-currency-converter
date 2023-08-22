package ru.asteises.currency_converter.converters;

import ru.asteises.currency_converter.util.CurrencyCode;

import java.util.HashMap;

public interface CurrencyExchangeRate {

    HashMap<CurrencyCode, Double> currencyExchangeRate = new HashMap<>();

    HashMap<CurrencyCode, Double> getCurrencyExchangeRate();

    Double getExchangeRateByCurrencyCode(CurrencyCode currencyCode);

    void setExchangeRateByCurrencyCode(CurrencyCode currencyCode, Double exchangeRate);
}
