import java.util.List;

public class Withdraw {

    private String name;
    private List<Lender> lenderList;
    private double amount;
    private double exchangeRate;

    public Withdraw(String name, List<Lender> lenderList, double amount, double exchangeRate) {
        this.name = name;
        this.lenderList = lenderList;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Lender> getLenderList() {
        return lenderList;
    }

    public void setLenderList(List<Lender> lenderList) {
        this.lenderList = lenderList;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String toString() {
        return "Withdraw{" +
                "name='" + name + '\'' +
                ", lenderList=" + lenderList +
                ", amount=" + amount +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
