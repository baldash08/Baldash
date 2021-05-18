import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a санын енгізіңіз: ");
        int a = scanner.nextInt(), n;
        System.out.print("n дәрежесін енгізіңіз: ");
        n = scanner.nextInt();
        int an = 1,i;
        for(i=0;i<n;i++) {
            an*=a;
        }
        System.out.println(a + " санының " + n + " дәрежесі "+an);
    }
}
