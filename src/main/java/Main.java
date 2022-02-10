import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String voucherStartingCharacters = VoucherDetails.setVoucherStartingCharacters();
        int voucherCharactersNumber = VoucherDetails.setVoucherCharactersNumber(voucherStartingCharacters);
        Set<String> vouchers = VoucherListCreator.createVoucherList(voucherStartingCharacters, voucherCharactersNumber);
        for (String n : vouchers) {
            System.out.println(n);
        }
    }
}