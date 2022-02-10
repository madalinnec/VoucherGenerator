import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class VoucherListCreator {

    public static Set<String> createVoucherList(String voucherDetails, int alphanumericCharactersNumber) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many codes would you like to have generated?");
        int vouchersNumber = 0;
        vouchersNumber = ExceptionForInts.checkInputForInt(vouchersNumber);
        Set<String> voucherList = new HashSet<>();
        for (int i = 0; i < vouchersNumber; i++) {
            voucherList.add(voucherDetails + RandomStringUtils.randomAlphanumeric(alphanumericCharactersNumber).toUpperCase());
        }
        return voucherList;
    }
}