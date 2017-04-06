import java.util.Scanner;

/**
 * Created by Kamal Kant on 04-04-2017.
 */
public class Calculator {
    int num1;
    int num2;

    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number");
        num1 = scanner.nextInt();
        System.out.print("Enter Second Number");
        num2 = scanner.nextInt();
    }

    void sum() {
        int temp = num1 + num2;
        System.out.println("Sum is : " + temp);
    }

    void sub() {
        int temp = num1 - num2;
        System.out.println("Sub is : " + temp);
    }

    void mul() {
        int temp = num1 * num2;
        System.out.println("Mul is : " + temp);
    }

    void div() {
        int temp = num1 / num2;
        System.out.println("Div is : " + temp);
    }

    void mod() {
        int temp = num1 % num2;
        System.out.println("Mod is : " + temp);
    }


    public static void main(String[] args) {
        System.out.println("Operation:");
        System.out.println("---------------------");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("6. Exit");
        System.out.println("---------------------");
        System.out.print("Enter Your choice : ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        Calculator calculator = new Calculator();

        switch (choice) {
            case 1:
                calculator.getInput();
                calculator.sum();
                break;
            case 2:
                calculator.getInput();
                calculator.sub();
                break;
            case 3:
                calculator.getInput();
                calculator.mul();
                break;
            case 4:
                calculator.getInput();
                calculator.div();
                break;
            case 5:
                calculator.getInput();
                calculator.mod();
                break;
            default:
                System.exit(0);

        }
    }
}
