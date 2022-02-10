import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class VouchersToCSV {

    public static void saveVouchersToCsv(Set<String> vouchers) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please type in the path and the filename: (Ex: c:\\myVouchers.csv)");
        String fileName = sc.next();
        String[] vouchersList = new String[vouchers.size()];
        vouchers.toArray(vouchersList);
        try(CSVWriter writer = new CSVWriter(new FileWriter(fileName))){
            writer.writeNext(vouchersList);
            }
        }
    }