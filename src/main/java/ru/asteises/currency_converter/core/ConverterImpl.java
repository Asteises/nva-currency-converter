package ru.asteises.currency_converter.core;

import ru.asteises.currency_converter.converters.CurrencyConverter;
import ru.asteises.currency_converter.converters.CurrencyRubConverter;
import ru.asteises.currency_converter.util.CurrencyCode;

import java.util.HashMap;
import java.util.Map;

public class ConverterImpl implements Converter {

    private static ConverterImpl INSTANCE;
    private final Map<CurrencyCode, CurrencyConverter> converters = new HashMap<>();

    public ConverterImpl() {
        converters.put(CurrencyCode.RUB, new CurrencyRubConverter());
    }

    public static ConverterImpl getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ConverterImpl();
        }
        return INSTANCE;
    }

    @Override
    public CurrencyConverter getConverterByCurrencyCode(CurrencyCode currencyCode) {
        return getConverters().get(currencyCode);
    }

    public Map<CurrencyCode, CurrencyConverter> getConverters() {
        return converters;
    }
}
