import java.util.ArrayList;
import java.util.List;

public class Run {

    public static void main(String[] args) {

        Lender lender1 = new Lender(1, "Andrzej GOłota", "Andrzej");
        Lender lender2 = new Lender(2, "Mike Tyson", "Miki");

        List<Lender> lenders = new ArrayList<>();
        lenders.add(lender1);
        lenders.add(lender2);

        Withdraw withdraw = new Withdraw("Wypłata piersza", lenders, 50.0, 10.0);

        List<WithdrawDetails> withdrawDetailsList = new ArrayList<>();

      //  WithdrawDetails first = new WithdrawDetails("Wyplata pierwsza",1, "Andrzej GOłota", "Andrzej",50.0, 10.0 );
       // WithdrawDetails second = new WithdrawDetails("Wyplata pierwsza",2, "Mike Tyson", "Miki", 50, 10.0 );

    }

}
