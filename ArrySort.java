import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kamal Kant on 03-04-2017.
 */
public class ArrySort {

    int[] numbers = new int[10];

    public void getArray() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number :");
            numbers[i] = scanner.nextInt();
        }
    }

    public void display() {
        //sort the elements of array
        Arrays.sort(numbers);
        System.out.println("Numbers are : ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }


    public static void main(String[] args) {
        ArrySort arrySort = new ArrySort();
        arrySort.getArray();
        arrySort.display();
    }
}
