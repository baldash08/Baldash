package math;

public class Geometry {
   public static strictfp void areaOfTriangle(double a, double b, double c) {
        double p = (a+b+c)/2;
        Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
