package ru.asteises.currency_converter.converters;

import ru.asteises.currency_converter.util.CurrencyCode;

import java.util.HashMap;
import java.util.Map;

public class CurrencyRubConverter implements CurrencyConverter {

    private final Map<CurrencyCode, Double> currencyExchangeRate = new HashMap<>();

    public CurrencyRubConverter() {
        currencyExchangeRate.put(CurrencyCode.USD, 99.1);
        currencyExchangeRate.put(CurrencyCode.EUR, 106.51);
    }

    @Override
    public double convert(double sum, CurrencyCode currencyCodeIn) {
        return sum / getExchangeRateByCurrencyCode(currencyCodeIn);
    }

    @Override
    public Double getExchangeRateByCurrencyCode(CurrencyCode currencyCode) {
        return getCurrencyExchangeRate().get(currencyCode);
    }

    @Override
    public void setExchangeRateByCurrencyCode(CurrencyCode currencyCode, Double exchangeRate) {
        getCurrencyExchangeRate().put(currencyCode, exchangeRate);
    }

    public Map<CurrencyCode, Double> getCurrencyExchangeRate() {
        return currencyExchangeRate;
    }

}
