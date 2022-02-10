import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionForInts extends Exception{

    public static int checkInputForInt(int number){
        Scanner sc = new Scanner(System.in);
        try {
            number = sc.nextInt();
        } catch (InputMismatchException ime) {
            throw new InputMismatchException("You created this exception. Please type a POSITIVE INT.");
        }
        if (number < 1) {
            throw new RuntimeException("You did something wrong. Please type a POSITIVE INT");
        }
        return number;
    }
}