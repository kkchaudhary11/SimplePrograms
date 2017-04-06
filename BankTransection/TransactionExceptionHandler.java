package BankTransection;

/**
 * Created by Kamal Kant on 06-04-2017.
 */
public class TransactionExceptionHandler extends Exception {


    public TransactionExceptionHandler(String s) {
        super(s);
    }

    @Override
    public String toString() {
        return "transaction failed";
    }
}
