/*
@author BO
 */

import java.util.*;

public class Home {
    public static void main(String[] args) {
        Random random = new Random();
        int matrix_max=0, matrix_min=0,sum=0,pro=0;
        int[][] matrix = new int[4][4];
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
                if(matrix_max < matrix[i][j]) matrix_max = matrix[i][j];
                if(matrix_min > matrix[i][j])  matrix_min = matrix[i][j];
                sum+=matrix[i][j];
                pro+=matrix[i][j];
            }
        }
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        System.out.println("Max element:" + matrix_max);
        System.out.println("Min element:"+ matrix_min);
        System.out.println("summa = " + sum);
        System.out.println("pro = " + pro);


    }
}