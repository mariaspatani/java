/*  Change the divide method below so that itthrows an IllegalArgumentException with  an appropriate message if b is zero
 public static double divide(double a, double b) {
 return a / b; }*/
public static double divide(double a, double b) {
    if (b == 0) {
        throw new IllegalArgumentException("Denominator cannot be zero.");
    }
    return a / b;
}
