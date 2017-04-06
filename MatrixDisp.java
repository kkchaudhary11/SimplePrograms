/**
 * Created by Kamal Kant on 04-04-2017.
 */
public class MatrixDisp {
    void getInput() {
        int[][] matrix = {{1, 2, 3}, {2, 4, 5}, {4, 4, 5}};

        System.out.println("Matrix : ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MatrixDisp matrixDisp = new MatrixDisp();
        matrixDisp.getInput();

    }
}
