import java.util.Scanner;
import static java.lang.System.*;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        double a,b,c,x1,x2,d;
        out.print("a санын енгізіңіз: "); a=scanner.nextDouble();
        out.print("b санын енгізіңіз: "); b=scanner.nextDouble();
        out.print("c санын енгізіңіз: "); c=scanner.nextDouble();
        // Дискриминантын тауып аламыз
        d=b*b - (4 * a * c);
       // Егер дискриминанты 0-ден кіші болса, шешімі жоқ
        if(d<0) {
            out.println("Бұл есептің шешімі жоқ");
        }
        // Егер дискриминанты 0-ге тең болса, бір ғана шешімі бар
        if(d==0) {
            x1=(-1*b)/(2*a);
            out.println("x1 = "+x1);
        }
        // Егер дискриминант 0-ден үлкен болса, екі шешімі болады
        if(d>0) {
            x1=(-1*b + Math.sqrt(d))/(2*a);
            x2=(-1*b - Math.sqrt(d))/(2*a);
            out.println("x1 = "+x1 + "\nx2 = " + x2);
        }
    }
}
