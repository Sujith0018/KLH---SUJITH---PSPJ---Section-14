public class FibonacciIterative {
    public static void printFibonacci(int n) {
        int firstTerm = 0;
        int secondTerm = 1;

            System.out.println("Fibonacci Series up to " + n + " terms:");

            for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");


            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

    public static void main(String[] args) {
        int terms = 10; // Number of terms to print
        printFibonacci(terms);

    }
}