package ru.asteises.currency_converter.converters;

import ru.asteises.currency_converter.util.CurrencyCode;

public interface CurrencyExchangeRate {

    Double getExchangeRateByCurrencyCode(CurrencyCode currencyCode);

    void setExchangeRateByCurrencyCode(CurrencyCode currencyCode, Double exchangeRate);
}
