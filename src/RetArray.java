import java.util.Arrays;
import java.util.*;

public class RetArray {
    public static Random random = new Random();
    static int[] Array_INT(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(15);
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write your array's size: ");
        int n = scanner.nextInt();
        int[] myArray = RetArray.Array_INT(n);
        System.out.println(Arrays.toString(myArray));
    }
}
