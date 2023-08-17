package ru.asteises.currency_converter.util;

public enum CurrencyCode {

    RUB("RUB"),
    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    HKD("HKD");

    private final String title;


    CurrencyCode(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static CurrencyCode findByValue(String title) {
        for (CurrencyCode code : values()) {
            if (!code.getTitle().equals(title)) {
                throw new IllegalArgumentException("Currency code doesn't exist");
            }
        }
        return CurrencyCode.valueOf(title);
    }
}
