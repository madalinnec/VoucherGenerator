import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        String voucherStartingCharacters = VoucherDetails.setVoucherStartingCharacters();
        int voucherCharactersNumber = VoucherDetails.setVoucherCharactersNumber(voucherStartingCharacters);
        Set<String> vouchers = VoucherListCreator.createVoucherList(voucherStartingCharacters, voucherCharactersNumber);
        VouchersToCSV.saveVouchersToCsv(vouchers);
    }
}