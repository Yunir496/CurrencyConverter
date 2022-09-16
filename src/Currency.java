/**
 * @author Yunir Yuliakshin
 */
public enum Currency {

    USD("USD"),
    EUR("EUR"),
    GBP("GBP"),
    JPY("JPY"),
    AUD("AUD"),
    CHF("CHF");

    private String value;

    Currency(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}