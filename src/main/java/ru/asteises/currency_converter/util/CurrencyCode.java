package ru.asteises.currency_converter.util;

public enum CurrencyCode {

    RUB("RUB", "российский рубль"),
    USD("USD", "американский доллар"),
    EUR("EUR", "евро"),
    GBP("GBP", "английский фунт"),
    HKD("HKD", "гонконгский доллар");

    private final String title;
    private final String name;


    CurrencyCode(String title, String name) {
        this.title = title;
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public String getName() {
        return name;
    }

    public static CurrencyCode findByValue(String title) {
        for (CurrencyCode code : values()) {
            if (code.getTitle().equals(title)) {
                return CurrencyCode.valueOf(title);
            }
        }
        throw new IllegalArgumentException("Currency code doesn't exist");
    }

}
