package UserDefineException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Kamal Kant on 06-04-2017.
 */
public class LoanCal {
    int salary;

    void getSalary() {
        try {
            BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter salary:");
            salary = Integer.parseInt(inp.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void loan() throws NotEligibleForLoan {
        if (salary < 0) {
            throw new NotEligibleForLoan("Not Eligible for loan");
        } else if (salary > 100000) {
            salary = salary * 10;
            throw new NotEligibleForLoan("Eligible for " + salary);
        } else if (salary > 50000) {
            salary = salary * 10;
            throw new NotEligibleForLoan("Eligible for " + salary);
        } else if (salary > 10000) {
            salary = salary * 10;
            throw new NotEligibleForLoan("eligible for " + salary);
        }
    }

    public static void main(String[] args) {

        LoanCal loanCal = new LoanCal();
        loanCal.getSalary();
        try {
            loanCal.loan();
        } catch (NotEligibleForLoan e) {
            System.out.println("Exception Occured :: " + e.getMessage());
        }
    }

}
