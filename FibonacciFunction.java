public class FibonacciFunction {
    public static long recurFib(long value) {
        if (value <= 1) {
            return value;
        }
        long newValue = recurFib(value-1) + recurFib(value - 2);
        return newValue;
    }
}
