/**
 * The Fibonacci series is a sequence of number where each of the numbers is equivalent to sum of previous two.
 *  For example: 0, 1, 1, 2, 3, 5, ETC
 */



public class main {
    public static void main(String[] args)
    {

        /**
         * This approach uses itteration
         * This exicutes inside the main and never calls a functiion, it only prints each loop
         */


        System.out.println("This is the Fibonacci function done in an iterative way");

        long sizeFibon = 10; // change this to increase size
        long current = 0;
        long last = 1;
        if (sizeFibon >= 1) System.out.print(current + " ");


        //My boss makes a dollar
        //I make a dime
        //thats why my algorithms
        //run in exponential time

        if (sizeFibon >= 2) {
            for (int i = 0; i < (sizeFibon - 2); i++) {
                long holder = current;
                current += last;
                last = holder;
                System.out.print(current + " ");

            }
        }
        System.out.println(" ");
        /**
         *  this calls the recursive functrion of the fibonacci function
         * @param sizeFibon
         * @return newValue
         * @see FibonacciFunction
         */
        System.out.println("This is the Fibonacci function done in an recursive way");
        for (int i = 0; i < (sizeFibon - 1); i++) {
            System.out.print(FibonacciFunction.recurFib(i) + " ");
        }
    }
}
