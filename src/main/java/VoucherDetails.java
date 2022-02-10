import java.util.Scanner;

public class VoucherDetails {

    public static String setVoucherStartingCharacters() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in what you would like the voucher to contain at the beginning: ");
        String voucherDetails = sc.next().toUpperCase().trim();
        return voucherDetails;
    }

    public static int setVoucherCharactersNumber(String voucherDetails) {
        Scanner sc = new Scanner(System.in);
        System.out.println(String.format("How many alphanumeric characters would you like to have after \033[3m%s\033[0m ?", voucherDetails));
        int alphanumericCharactersNumber = 0;
        alphanumericCharactersNumber = ExceptionForInts.checkInputForInt(alphanumericCharactersNumber);
        return alphanumericCharactersNumber;
    }
}