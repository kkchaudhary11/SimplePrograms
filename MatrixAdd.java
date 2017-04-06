import java.util.Scanner;

/**
 * Created by Kamal Kant on 06-04-2017.
 */
public class MatrixAdd {

    int[][] matrix1 = new int[3][3];
    int[][] matrix2 = new int[3][3];
    int[][] resultMatrix = new int[3][3];


    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Matrix : ");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter Second Matrix : ");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }
    }

    void addmatrix() {
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

    }

    void display() {

        System.out.println("Matrix Sum: ");


        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix.length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {

        MatrixAdd matrixAdd = new MatrixAdd();
        matrixAdd.getData();
        matrixAdd.addmatrix();
        matrixAdd.display();
    }
}
