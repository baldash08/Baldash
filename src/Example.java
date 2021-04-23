import math.Geometry;

import java.util.Scanner;
//import static java.lang.System.*;

public class Example {
    Example(String yourName) {
        System.out.println("Hello, " + yourName);
    }
    Example() {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(),m=scanner.nextInt(),i,j;
        char[][] matrix = new char[n][m];
        char[][] matrix1 = new char[n][m];
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                matrix[i][j] = scanner.next().charAt(0);
            }
        }
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                matrix1[i][j] = scanner.next().charAt(0);
            }
        }
        int cnt = 0;
        for(i=0;i<n;i++) {
            for(j=0;j<m;j++) {
                if(matrix[i][j] == matrix1[i][j]) cnt++;
            }
        }
        System.out.println(cnt);
*/
        Geometry.areaOfTriangle(2,5,6);
        Example example = new Example();

    }
}
