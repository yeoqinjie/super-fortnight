public class CurrencyExchange {
    private double capital;

    public CurrencyExchange(double capital) {
        setCapital(capital);
    }

    public static double exchangeSGDUSD(double amount) {
        return amount * 0.76;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
}
