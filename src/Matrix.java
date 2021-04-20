import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int p = scanner.nextInt();
        int i,j;
        int[][] matrix = new int[n][m];
        int[][] matrix1 = new int[m][p];
        int[][] matrix2 = new int[m][p];
        for(i=0;i<n;i++) {
            for(j=0;j< m;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
        for(i=0;i<m;i++) {
            for(j=0;j< p;j++){
                matrix1[i][j] = scanner.nextInt();
            }
        }
        for(i=0;i<m;i++) {
            for(j=0;j< p;j++){
                matrix2[i][j] += (matrix[0][0] * matrix1[0][j]) + (matrix[i][j+1] * matrix1[i+1][j]);
            }
        }
        for(i=0;i<m;i++){
            for(j=0;j<p;j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
