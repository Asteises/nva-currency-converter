package ru.asteises.currency_converter.core;

import ru.asteises.currency_converter.converters.CurrencyConverter;
import ru.asteises.currency_converter.util.CurrencyCode;

public interface Converter {

    CurrencyConverter getConverterByCurrencyCode(CurrencyCode currencyCode);
}
