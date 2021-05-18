import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n], b  = new int[n], c = new int[n];
        int i;
        for(i=0;i<a.length;i++) a[i] = scanner.nextInt();
        for(i=0;i<b.length;i++) b[i] = scanner.nextInt();
        for(i=0;i<n;i++) {
            c[i] = Math.max(a[i], b[i]);
            System.out.print("c["+i+"] = "+c[i] + " ");
        }
    }
}
