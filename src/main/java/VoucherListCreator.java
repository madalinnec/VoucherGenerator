import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class VoucherListCreator {

    public static Set<String> createVoucherList(String voucherDetails, int alphanumericCharactersNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many codes would you like to have generated?");
        int vouchersNumber = 0;
        try {
            vouchersNumber = sc.nextInt();
        } catch (InputMismatchException ime) {
            throw new InputMismatchException("You created this error. Please type a POSITIVE INT.");
        }
        if (vouchersNumber < 1) {
            throw new RuntimeException("You did something wrong. Please type a POSITIVE INT");
        }
        Set<String> voucherList = new HashSet<>();
        for (int i = 0; i < vouchersNumber; i++) {
            voucherList.add(voucherDetails + RandomStringUtils.randomAlphanumeric(alphanumericCharactersNumber).toUpperCase());
        }
        return voucherList;
    }
}