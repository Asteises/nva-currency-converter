package ru.asteises.currency_converter.converters;

import ru.asteises.currency_converter.util.CurrencyCode;

public interface CurrencyConverter extends CurrencyExchangeRate {

    double convert(double sum, CurrencyCode currencyCodeIn);

}
