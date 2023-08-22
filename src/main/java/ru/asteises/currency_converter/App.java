package ru.asteises.currency_converter;

import ru.asteises.currency_converter.converters.CurrencyConverter;
import ru.asteises.currency_converter.core.Converter;
import ru.asteises.currency_converter.core.ConverterImpl;
import ru.asteises.currency_converter.util.CurrencyCode;

public class App {

    public static void main(String[] args) {

        Converter converter = ConverterImpl.getInstance();
        CurrencyConverter rubConverter = converter.getConverterByCurrencyCode(CurrencyCode.findByValue("RUB"));
        System.out.println(rubConverter.convert(1000.0, CurrencyCode.findByValue("USD")));
        rubConverter.setExchangeRateByCurrencyCode(CurrencyCode.findByValue("USD"), 99.99);
        System.out.println(rubConverter.convert(1000.0, CurrencyCode.findByValue("USD")));
        rubConverter.convert(1000.0, CurrencyCode.findByValue("BLABLA"));
    }
}
