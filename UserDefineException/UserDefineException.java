package UserDefineException;

/**
 * Created by Kamal Kant on 06-04-2017.
 */
public class UserDefineException {

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age ::");
        }
    }

    public static void main(String[] args) {

        try {
            validateAge(17);
        } catch (InvalidAgeException e) {
            System.out.println("Exception Occured :: " + e.getMessage());
        }

    }
}
