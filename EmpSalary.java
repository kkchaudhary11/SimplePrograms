import java.util.Scanner;

/**
 * Created by Kamal Kant on 03-04-2017.
 */
public class EmpSalary {

    String empName;
    int salary;
    int totalsalary;
    int bonus;
    int totalspend = 0;


    public void getEmployees() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Employee Name : ");
            empName = scanner.next();
            System.out.print("Enter Employee Salary : ");
            salary = scanner.nextInt();

            if (salary <= 10000) {
                bonus = 3000; //30%
                totalsalary = salary + bonus;
                System.out.println("Total salary for " + empName + " with bonus is : " + totalsalary);
                totalspend = totalspend + bonus;
            } else if (salary <= 50000) {
                bonus = 10000; //20%
                totalsalary = salary + bonus;
                System.out.println("Total salary for " + empName + " with bonus is : " + totalsalary);
                totalspend = totalspend + bonus;
            } else if (salary <= 100000) {
                bonus = 10000; //10%
                totalsalary = salary + bonus;
                System.out.println("Total salary for " + empName + " with bonus is : " + totalsalary);
                totalspend = totalspend + bonus;
            } else {
                System.out.println("Total salary for " + empName + " with bonus is : " + salary);
            }
        }
    }

    public void display() {
        System.out.println("Total Spend on bonus : ₹" + totalspend);
    }

    public static void main(String[] args) {

        EmpSalary empSalary = new EmpSalary();
        empSalary.getEmployees();
        empSalary.display();
    }
}
