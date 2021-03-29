import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int i,j,sum;
        int[][] matrix = new int[n][m];
        for(i=0;i<n;i++) {
            for(j=0;j< m;j++){
                matrix[i][j] = scanner.nextInt();
            }
        }
//        for(i=0;i<n;i++) {
//            sum=0;
//            for(j=0;j< m;j++){
//                sum+=matrix[i][j];
//            }
//            System.out.print(sum + " ");
//        }
//        System.out.println("");
//        for(j=0;j<m;j++) {
//            sum=0;
//            for(i=0;i< n;i++){
//                sum+=matrix[i][j];
//            }
//            System.out.print(sum + " ");
//        }
//        System.out.println("\n");
            for(i=n-1;i>-1;i--){
                for(j=0;j<m;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
