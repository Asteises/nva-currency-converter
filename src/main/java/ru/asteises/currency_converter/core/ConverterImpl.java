package ru.asteises.currency_converter.core;

import ru.asteises.currency_converter.converters.CurrencyConverter;
import ru.asteises.currency_converter.converters.rub.RubConverterImpl;
import ru.asteises.currency_converter.util.CurrencyCode;

import java.util.HashMap;

public class ConverterImpl implements Converter {

    private static ConverterImpl INSTANCE;
    private final HashMap<CurrencyCode, CurrencyConverter> converters = new HashMap<>();

    public ConverterImpl() {
        converters.put(RubConverterImpl.currencyCode, new RubConverterImpl());
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

    public HashMap<CurrencyCode, CurrencyConverter> getConverters() {
        return converters;
    }
}
