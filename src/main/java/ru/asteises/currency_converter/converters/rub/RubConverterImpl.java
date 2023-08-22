package ru.asteises.currency_converter.converters.rub;

import ru.asteises.currency_converter.converters.CurrencyConverter;
import ru.asteises.currency_converter.util.CurrencyCode;

import java.util.HashMap;

public class RubConverterImpl implements CurrencyConverter {

    public static final CurrencyCode currencyCode = CurrencyCode.RUB;

    private final HashMap<CurrencyCode, Double> currencyCodeDoubleHashMap = CurrencyConverter.currencyExchangeRate;

    public RubConverterImpl() {
        currencyExchangeRate.put(CurrencyCode.USD, 99.1);
        currencyExchangeRate.put(CurrencyCode.EUR, 106.51);
    }

    /**
     * Метод вычисляет какое количество валюты можно купить на указанную сумму рублей.
     *
     * @param sum            - сумма рублей, на которую нужно купить валюту;
     * @param currencyCodeIn - обозначение валюты, которую хотим купить;
     * @return - возвращаем сумму купленной валюты;
     */
    @Override
    public double convert(double sum, CurrencyCode currencyCodeIn) {
        return sum / getExchangeRateByCurrencyCode(currencyCodeIn);
    }

    /**
     * Метод достает из хранилища курс к рублю той валюты, которая пришла в параметрах.
     *
     * @param currencyCode - обозначение валюты, которую хотим купить;
     * @return - возвращаем курс по отношению к переданной валюте;
     */
    @Override
    public Double getExchangeRateByCurrencyCode(CurrencyCode currencyCode) {
        return getCurrencyExchangeRate().get(currencyCode);
    }

    @Override
    public void setExchangeRateByCurrencyCode(CurrencyCode currencyCode, Double exchangeRate) {
        getCurrencyExchangeRate().put(currencyCode, exchangeRate);
    }

    @Override
    public HashMap<CurrencyCode, Double> getCurrencyExchangeRate() {
        return currencyCodeDoubleHashMap;
    }
}
