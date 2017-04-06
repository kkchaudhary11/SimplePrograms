import java.util.Scanner;

/**
 * Created by Kamal Kant on 03-04-2017.
 */
public class ArrySumAvg {

    int[] numbers = new int[10];

    public void getArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number :");
            numbers[i] = scanner.nextInt();
        }
    }

    public void display() {
        int sum = 0;
        for (int number : numbers) {
            sum = sum + number;
        }
        System.out.println("Sum is : " + sum);
        System.out.println("Average is : " + sum / numbers.length);
    }


    public static void main(String[] args) {
        ArrySumAvg arrySort = new ArrySumAvg();
        arrySort.getArray();
        arrySort.display();
    }
}
