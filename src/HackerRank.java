import java.util.Scanner;

public class HackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0,n=scanner.nextInt();
        int[][] matrix = new int[n][];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum+=matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}
