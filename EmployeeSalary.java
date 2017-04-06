import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kamal Kant on 03-04-2017.
 */
public class EmployeeSalary {

    String[][] employees = new String[5][5];

    public void getArray() {

        Scanner scanner = new Scanner(System.in);

        //initialize
        for (int i = 0; i < employees.length; i++) {
            System.out.print("Enter Employee Name : ");
            employees[0][i] = scanner.next();

            System.out.print("Enter Salary : ");
            employees[1][i] = scanner.next();
        }
    }


    public void cal() {
        int average = 0;
        int[] empint = new int[5];

        for (int i = 0; i < employees.length; i++) {
            empint[i] = Integer.parseInt(employees[1][i]);
        }
        Arrays.sort(empint);

        for (int i = 0; i < employees.length; i++) {
            if (empint[employees.length - 1] == Integer.parseInt(employees[1][i])) {
                System.out.println("Highest paid Employee  : " + employees[0][i]);
            }
        }

        for (int i = 0; i < employees.length; i++) {
            if (empint[0] == Integer.parseInt(employees[1][i])) {
                System.out.println("Lowest paid Employee : " + employees[0][i]);
            }
        }

        for (int i = 0; i < employees.length; i++) {
            average += empint[i];
        }
        System.out.println("Average Salary Of Employees : " + average / employees.length);
    }

    public static void main(String[] args) {
        EmployeeSalary arrySort = new EmployeeSalary();
        arrySort.getArray();
        arrySort.cal();
    }
}
