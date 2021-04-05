import java.util.Scanner;

import static java.lang.System.*;

public class CharMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        char[][] matrix = new char[4][4];
        int i,j;
        String str = "";
        for(i=0;i<4;i++) {
            for(j=0;j<4;j++) {
                matrix[i][j] = scanner.next().charAt(0);
                for (j = 0; j < 4; j++) {
                    if ((matrix[i][j] == 'B' && matrix[i + 1][j] == 'B' && matrix[i][j + 1] == 'B' && matrix[i + 1][j + 1] == 'B')
                            || (matrix[i][j] == 'W' && matrix[i + 1][j] == 'W' && matrix[i][j + 1] == 'W' && matrix[i + 1][j + 1] == 'W'))
                        str = "NO";

                    else str = "YES";
            }
        }
//        for(i=0;i<4;i++) {
//
//            }
            out.println(str);
        }
    }
}
