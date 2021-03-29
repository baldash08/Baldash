import java.util.Scanner;

public class Recursion {
    static long f(long n) {
        if(n<3) return 1;
        else return f(n-1)+f(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        System.out.println(f(n));
    }
}
