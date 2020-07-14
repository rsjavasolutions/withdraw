import java.util.List;

public class WithdrawDetails {

    private String name;
    private Integer lenderId;
    private String lenderFullName;
    private String lenderShortName;
    private double amount;
    private double exchangeRate;

    public WithdrawDetails(String name, Integer lenderId, String lenderFullName, String lenderShortName, double amount, double exchangeRate) {
        this.name = name;
        this.lenderId = lenderId;
        this.lenderFullName = lenderFullName;
        this.lenderShortName = lenderShortName;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }
}
