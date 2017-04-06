import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Kamal Kant on 03-04-2017.
 */
public class ArryStudent {

    String[][] students = new String[10][10];

    public void getArray() {

        Scanner scanner = new Scanner(System.in);

        //initialize name of students
        students[0][0] = "ram";
        students[0][1] = "shyam";
        students[0][2] = "hussen";
        students[0][3] = "pawan";
        students[0][4] = "rashmi";
        students[0][5] = "swati";
        students[0][6] = "aditya";
        students[0][7] = "pallivi";
        students[0][8] = "harris";
        students[0][9] = "peter";

        //initialize marks
        for (int i = 0; i < students.length; i++) {
            System.out.print(i + 1 + ". Enter marks for " + students[0][i] + " : ");
            students[1][i] = scanner.next();
        }
    }


    public void display() {
        int highest = 0;
        String name;

        //compare marks
        for (int i = 0; i < students.length; i++) {
            String mark = students[1][i];
            if (Integer.parseInt(mark) > highest) {
                highest = Integer.parseInt(mark);
            }
        }

        //find students with highest marks
        for (int i = 0; i < students.length; i++) {
            String mark = students[1][i];
            if (Integer.parseInt(mark) == highest) {
                name = students[0][i];
                System.out.println("Highest Scorer : " + name);
            }
        }
    }

    public static void main(String[] args) {
        ArryStudent arrySort = new ArryStudent();
        arrySort.getArray();
        arrySort.display();
    }
}
