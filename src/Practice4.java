import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), k = scanner.nextInt();
        int sum = 0;
        for(int i=1;i<n+1;i++) {
            sum+=i*k;
        }
        System.out.println(sum);
    }
}
