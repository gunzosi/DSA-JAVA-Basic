package DynamicProgramming;

public class Fibonacci {
    static Integer[] memo = new Integer[100];
    static int counter = 0;
    static int count = 0;

    // TopDown Approach
    public static int fibonacci(int n){
        counter++;
        if (memo[n] != null){
            return memo[n];
        }
        if (n == 0 || n == 1){
            return n;
        }
        memo[n] = fibonacci(n-1) + fibonacci(n-2);
        return memo[n];
    }

    // BottomUp Approach
    public static int fib(int n){
        int[] fibList = new int[n + 1];
        fibList[0] = 0;
        fibList[1] = 1;

        for (int index = 2; index <= n ; index++){
            count++;
            fibList[index] = fibList[index - 1] + fibList[index - 2];
        }
        return fibList[n];
    }

    public static void main(String[] args) {
        int n = 40; // Count = 39 => O(n-1)

        System.out.println("Fibonacci - Top Down Approach -  of " + n + " is: " + fibonacci(n));
        System.out.println("Counter - Top: " + counter);
        System.out.println();
        System.out.println("Fibonacci - Bottom Up Approach -  of " + n + " is: " + fib(n));
        System.out.println("Counter - Bottom: " + count);
    }
}
