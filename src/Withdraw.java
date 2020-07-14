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
