import java.util.ArrayList;
import java.util.List;

/**
 * @author Yunir Yuliakshin
 */
class Database {

    private final List<CurrencyPair> currencyPairList;

    public Database() {
        currencyPairList = new ArrayList<>();
        currencyPairList.add(new CurrencyPair(1, Currency.USD,Currency.JPY,125.42,125.43));
        currencyPairList.add(new CurrencyPair(2, Currency.EUR, Currency.USD, 1.2544, 1.2545));
        currencyPairList.add(new CurrencyPair(3, Currency.GBP, Currency.USD, 14.2842, 14.2843));
        currencyPairList.add(new CurrencyPair(4, Currency.AUD, Currency.USD, 16.2042, 16.8543));
        currencyPairList.add(new CurrencyPair(5, Currency.USD, Currency.CHF, 1.3750, 1.3754));
        currencyPairList.add(new CurrencyPair(6, Currency.EUR, Currency.JPY, 15.2942, 15.8543));
        currencyPairList.add(new CurrencyPair(7, Currency.EUR, Currency.GBP, 0.6790, 0.6794));
    }

    public List<CurrencyPair> getCurrencyPairList() {
        return currencyPairList;
    }
}
