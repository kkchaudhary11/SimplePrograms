import java.util.Scanner;

/**
 * Created by Kamal Kant on 04-04-2017.
 */
public class ReverseNumber {

    int number, reverse;

    void getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        number = scanner.nextInt();

        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }

        System.out.println("Reversed Number : " + reverse);

    }


    public static void main(String[] args) {

        ReverseNumber reverseNumber = new ReverseNumber();
        reverseNumber.getNumber();
    }
}
