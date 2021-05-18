import static java.lang.System.*;

public class Practice2 {
    public static void main(String[] args) throws java.io.IOException {
        byte b = 45;
        short sh = 257;
        int i = 321564;
        long l = 36541235;
        float f = 3.15f;
        double d = 1.1545d;
        char c = 20;
        boolean bl = false;

        byte b1 = (byte) sh; // размер байта  256, значение sh равно 257, поэтому b1 равняется на остаток деление sh на b
        i = b; // неявное приведение
        i = (int) b; // явное приведение
        i = (int) d;
        d = (double) sh;
        out.println(b1);
        out.println("Byte: " + b);
        out.println("Short: " + sh);
        out.println("Integer: " + i);
        out.println("Long: " + l);
        out.println("Float: " + f);
        out.println("Double: " + d);
        out.println("Character: " + c);
        out.println("Boolean: " + bl);
        out.println("Short sh to byte: " + b1);
        char choice = (char) in.read();
    }
}
