import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int number) {
        for(int i = 2; i <= number/i; i++) {
            if(number%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) throws java.io.IOException{
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(),b = scanner.nextInt(),c = scanner.nextInt();
        int cnt = 0;
        if(isPrime(a)) {
            cnt+=a;
        }
        if(isPrime(b)) {
            cnt+=b;
        }
        if(isPrime(c)) {
            cnt+=c;
        }
        if(isPrime(cnt)) {
            System.out.println(cnt);
            System.out.println("Yes");
        }else{
            System.out.println(cnt);
            System.out.println("No");
        }
//        int[][] nums = new int[4][4];
//        for(int x[] : nums) {    x эта переменная является ссылкой на одномерной массив
//            for(int y : x) {
//
//            }
//        }
    }
}
