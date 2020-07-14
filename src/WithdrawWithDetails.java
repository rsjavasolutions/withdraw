import java.util.List;

public class WithdrawWithDetails {

    private String name;
    private Integer lenderId;
    private String lenderFullName;
    private String lenderShortName;
    private double amount;
    private double exchangeRate;

    public WithdrawWithDetails() {
    }

    public WithdrawWithDetails(String name, Integer lenderId, String lenderFullName, String lenderShortName, double amount, double exchangeRate) {
        this.name = name;
        this.lenderId = lenderId;
        this.lenderFullName = lenderFullName;
        this.lenderShortName = lenderShortName;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLenderId() {
        return lenderId;
    }

    public void setLenderId(Integer lenderId) {
        this.lenderId = lenderId;
    }

    public String getLenderFullName() {
        return lenderFullName;
    }

    public void setLenderFullName(String lenderFullName) {
        this.lenderFullName = lenderFullName;
    }

    public String getLenderShortName() {
        return lenderShortName;
    }

    public void setLenderShortName(String lenderShortName) {
        this.lenderShortName = lenderShortName;
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
        return "WithdrawWithDetails{" +
                "name='" + name + '\'' +
                ", lenderId=" + lenderId +
                ", lenderFullName='" + lenderFullName + '\'' +
                ", lenderShortName='" + lenderShortName + '\'' +
                ", amount=" + amount +
                ", exchangeRate=" + exchangeRate +
                '}';
    }
}
