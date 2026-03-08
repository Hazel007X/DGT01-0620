package exchange;

public class Exchange {
    final double USD = 30.72;
    final double EURO = 41.89;
    final double YEN = 36.97;
    final double POUND = 48.34;
    
    public double exchangeUSD(double amount) {
        return amount * USD;
    }
    
    public double exchangeEURO(double amount) {
        return amount * EURO;
    }
    
    public double exchangeYEN(double amount) {
        return amount * YEN;
    }
    
    public double exchangePOUND(double amount) {
        return amount * POUND;
    }
}