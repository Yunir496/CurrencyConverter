/**
 * @author Yunir Yuliakshin
 */
public class CurrencyPair {

    private final int id;
    private final Currency currencyFrom;
    private final Currency currencyTo;
    private final double bid;
    private final double ask;

    public CurrencyPair(int id,
                        Currency currencyFrom,
                        Currency currencyTo,
                        double bid,
                        double ask) {
        this.id = id;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.bid = bid;
        this.ask = ask;
    }

    public int getId() {
        return id;
    }

    public Currency getCurrencyFrom() {
        return currencyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public double getBid() {
        return bid;
    }

    public double getAsk() {
        return ask;
    }

    @Override
    public String toString() {
        return "Для пары " +
                currencyFrom.getValue() + "/" +
                currencyTo.getValue() + ", bid=" +
                bid + ", ask=" + ask +" введите " + id;
    }
}
