import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n==1) System.out.println("Понедельник,рабочий день");
        else if(n==2) System.out.println("Вторник,рабочий день");
        else if(n==3) System.out.println("Среда,рабочий день");
        else if(n==4) System.out.println("Четверг,рабочий день");
        else if(n==5) System.out.println("Пятница,рабочий день");
        else if(n==6) System.out.println("Суббота,выходной день");
        else if(n==7) System.out.println("Воскресенье,выходной день");
    }
}