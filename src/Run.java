import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Run {

    public static void main(String[] args) {
        Lender lender1 = new Lender(1, "Andrzej GOłota", "Andrzej");
        Lender lender2 = new Lender(2, "Mike Tyson", "Miki");
        Lender lender3 = new Lender(3, "Mariusz Pudzianowski", "Pudzian");
        Lender lender4 = new Lender(4, "Sławek Toczek", "Mały");

        List<Lender> lenders = new ArrayList<>();
        lenders.add(lender1);
        lenders.add(lender2);
        lenders.add(lender3);
        lenders.add(lender4);
        Withdraw withdraw1 = new Withdraw("Wypłata piersza", lenders, 50.0, 10.0);

        Lender kate = new Lender(99, "Kate kate", "K");
        Lender mick = new Lender(22, "Bick kkkkkk", "M");
        Lender tra = new Lender(31, "Trebor", "T");

        List<Lender> lenders2 = new ArrayList<>();
        lenders2.add(kate);
        lenders2.add(mick);
        lenders2.add(tra);
        Withdraw withdraw2 = new Withdraw("DRUGA WPŁATA!!!!!!",lenders2, 987456321.0, 5555.0);

        List<Withdraw> withdrawList = new ArrayList<>(Arrays.asList(withdraw1,withdraw2));

        System.out.println(flattenStructure(withdrawList));
    }

    private static List<WithdrawWithDetails> flattenStructure(List<Withdraw> withdrawList) {
        return withdrawList.stream()
                .flatMap(withdraw -> withdraw.getLenderList().stream()
                        .map(lender -> createDetails(lender, withdraw))
                ).collect(Collectors.toList());
    }

    private static WithdrawWithDetails createDetails(Lender lender, Withdraw withdraw) {
        WithdrawWithDetails withdrawWithDetails = new WithdrawWithDetails();
        withdrawWithDetails.setName(withdraw.getName());
        withdrawWithDetails.setLenderId(lender.getId());
        withdrawWithDetails.setLenderFullName(lender.getFullName());
        withdrawWithDetails.setLenderShortName(lender.getShortName());
        withdrawWithDetails.setAmount(withdraw.getAmount());
        withdrawWithDetails.setExchangeRate(withdraw.getExchangeRate());
        return withdrawWithDetails;
    }

//    private static List<WithdrawWithDetails> mapToWithdrawWithDetailsList(Withdraw withdraw) {
//        List<WithdrawWithDetails> withdrawWithDetailsList = new ArrayList<>();
//        List<Lender> lenderList = withdraw.getLenderList();
//        WithdrawWithDetails withdrawWithDetails;
//
//        for (Lender lender : lenderList) {
//            withdrawWithDetails = new WithdrawWithDetails();
//            withdrawWithDetails.setName(withdraw.getName());
//
//            withdrawWithDetails.setLenderId(lender.getId());
//            withdrawWithDetails.setLenderFullName(lender.getFullName());
//            withdrawWithDetails.setLenderShortName(lender.getShortName());
//
//            withdrawWithDetails.setAmount(withdraw.getAmount());
//            withdrawWithDetails.setExchangeRate(withdraw.getExchangeRate());
//
//            withdrawWithDetailsList.add(withdrawWithDetails);
//        }
//        return withdrawWithDetailsList;
//    }

//    public static List<WithdrawWithDetails> mapToList(List<Withdraw> withdrawList) {
//
//        List<WithdrawWithDetails> listToReturn = new ArrayList<>();
//
//        List<List<WithdrawWithDetails>> list = withdrawList
//                .stream()
//                .map(x -> mapToWithdrawWithDetailsList(x))
//                .collect(Collectors.toList());
//
//        for (int i = 0; i < list.size(); i++)
//            for (List<WithdrawWithDetails> withdrawWithDetails : list) {
//                listToReturn.add(withdrawWithDetails.get(i));
//            }
//        return listToReturn;
//    }
}
