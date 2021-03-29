import java.util.Scanner;

public class Array2 {
    public static Scanner scanner = new Scanner(System.in);
    static int maxArray(int[] array) {
        int max=array[0];
        for (int number : array) {
            if(number > max) max = number;
        }
        return max;
    }
    static int minArray(int[] array) {
        int min=array[0];
        for (int number : array) {
            if(number < min) min = number;
        }
        return min;
    }
    public static void main(String[] args) {
        System.out.print("Write your array's size: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        if(n==1) System.out.print("Write " + n + " number: ");
        else if(n>1) System.out.print("Write " + n + " numbers: ");
        for (int i = 0; i < n; i++) array[i] = scanner.nextInt();
        int max = Array2.maxArray(array);
        int min = Array2.minArray(array);
        System.out.println("The maximum element of array is: " + max);
        System.out.println("The minimum element of array is: " + min);
    }
}
