import org.omg.PortableInterceptor.INACTIVE;

import java.util.Scanner;

/**
 * Created by Kamal Kant on 11-04-2017.
 */
public class GenericClassAcceptData {

    //employee<String,String> datam = new employee<String,String>("Apple","It is a type Fruit");


    public static void main(String[] args) {

        Scanner sin = new Scanner(System.in);
        Integer salary = sin.nextInt();
        String empname = sin.next();

        employee<String,Integer> datam = new employee<>(empname,salary);

        datam.printmeaning();
    }

    static class employee<S,N>
    {
        private S salray;
        private N name;

        public employee(S salray, N name) {
            System.out.println("Accepted in Genric class");
            this.salray = salray;
            this.name = name;

        }
        private void printmeaning(){
            System.out.println(salray);
            System.out.println(name);
        }
    }
}
