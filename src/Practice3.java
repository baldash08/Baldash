import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if(x==0) System.out.println("Нулевое число");
        if(x<0 && x%2==0) System.out.println("Отрицательное четное число");
        if(x>0 && x%2==1) System.out.println("Положительное нечетное число");
    }
}
