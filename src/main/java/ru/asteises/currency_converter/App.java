package ru.asteises.currency_converter;

import ru.asteises.currency_converter.converters.CurrencyConverter;
import ru.asteises.currency_converter.core.Converter;
import ru.asteises.currency_converter.core.ConverterImpl;
import ru.asteises.currency_converter.util.CurrencyCode;

public class App {

    public static void main(String[] args) {
        Converter converter = ConverterImpl.getInstance();
        CurrencyConverter currencyRubConverter = converter.getConverterByCurrencyCode(CurrencyCode.USD);
        System.out.println(currencyRubConverter.convert(1, CurrencyCode.USD));
        System.out.println(currencyRubConverter.convert(1000, CurrencyCode.USD));
        currencyRubConverter.setExchangeRateByCurrencyCode(CurrencyCode.USD, 111.11);
        System.out.println(currencyRubConverter.convert(1000, CurrencyCode.USD));
        System.out.println(currencyRubConverter.convert(1000, CurrencyCode.findByValue("BLABLA")));
    }
}
