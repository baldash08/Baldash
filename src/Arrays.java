import java.util.Scanner;

public class Arrays {
    public static Scanner scanner = new Scanner(System.in);
    public void PrintArray(int size){
        int[] array = new int[size];
        if(size==1) System.out.print("Write " + size + " number: ");
        else if(size>1) System.out.print("Write " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("This PrintArray's method printed [");
        for (int i = 0; i < size-1; i++) {
            System.out.print(array[i] + ",");
        }
        System.out.print(array[size-1]+"]");
    }
    public static void main(String[] args) {
        System.out.print("Write your Array's size: ");
        int n = scanner.nextInt();
       Arrays obj = new Arrays();
       obj.PrintArray(n);
    }
}
