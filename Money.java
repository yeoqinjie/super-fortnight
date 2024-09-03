public class Money {
    private double savings;

    public Money(double savings) {
        setSavings(savings);
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }
    
    public double doubleMoney() {
        return multiplyMoney(2);
    }

    public double tripleMoney() {
        return multiplyMoney(3);
    }

    public double multiplyMoney(int size) {
        return savings * size;
    }
}
