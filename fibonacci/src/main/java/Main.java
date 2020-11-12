public class Main {

    public static void main(String[] args) {
        // write your code here
        final int N = 9;
        System.out.println("Optimized: " + fibonacci2(N));
        System.out.println("Not optimized: " + fibonacci2(N));
    }

    /*
     * Fibonacci not optimized method
     * We make a lot of repetition work
     * Ex fib(5):
     *                             fib(5)
     *                        /                \
     *                  fib(4)                fib(3)
     *                /        \              /       \
     *            fib(3)      fib(2)         fib(2)   fib(1)
     *           /    \       /    \        /      \
     *     fib(2)   fib(1)  fib(1) fib(0) fib(1) fib(0)
     *     /     \
     *  fib(1) fib(0)
     */
    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        } else {
            return fibonacci(n- 1) + fibonacci(n - 2);
        }
    }

    /*
     * Fibonacci optimized method
     * We save the 2 previous numbers in the serie (a and b)
     */
    public static int fibonacci2(int n){
        int a = 0, b = 1, c;
        if (n == 0){
            return n;
        } else {
            //From 2 to n, because fib0 = 0 and fib1= 1
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            //b = c (but for not ini I use b)
            return b;

        }
    }

}
