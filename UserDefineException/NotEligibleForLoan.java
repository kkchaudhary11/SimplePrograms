package UserDefineException;

/**
 * Created by Kamal Kant on 06-04-2017.
 */
public class NotEligibleForLoan extends Exception {

    public NotEligibleForLoan(String s) {
        super(s);
    }

    public String toString() {
        return "invalid";
    }
}
