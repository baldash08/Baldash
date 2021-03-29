public class Date{
    public static void main(String[] args) {
        double x1 = 5;
        double y1 = 4;
        double x2 = 6;
        double y2 = 3;
        double x3 = 8;
        double y3 = 7;
        double a = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        double b = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
        double c = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
        double p = (a+b+c)/2;
        double h = (2*Math.sqrt(p*(p-a)*(p-b)*(p-c)))/a;
        double m = Math.sqrt(2*b*b + 2*c*c - a*a)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println("H:" + h + "\n M:" + m + "\n S:" + s);
    }
}