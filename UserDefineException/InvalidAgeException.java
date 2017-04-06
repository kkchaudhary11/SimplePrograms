package UserDefineException;

/**
 * Created by Kamal Kant on 06-04-2017.
 */
public class InvalidAgeException extends Exception {

    public InvalidAgeException(String s) {
        super(s);
    }

    public String toString() {
        return "Age should not be less then 18 years for voting";
    }

}
