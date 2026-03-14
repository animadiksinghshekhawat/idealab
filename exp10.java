/ Write a Java program to implement 
recursion by calculating the factorial and nth Fibonacci 
number.

import java.util.Scanner;

public class RecursionDemo {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) { // Base case
            return 1;
        } else {
            return n * factorial(n - 1); // Recursive call
        }
    }

    // Recursive method to calculate nth Fibonacci number
    public static long fibonacci(int n) {
        if (n == 0) { // Base case
            return 0;
        } else if (n == 1) { // Base case
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Factorial
        System.out.print("Enter a number to calculate factorial: ");
        int num = scanner.nextInt();
        long fact = factorial(num);
        System.out.println("Factorial of " + num + " is: " + fact);

        // Fibonacci
        System.out.print("\nEnter n to find the nth Fibonacci number: ");
        int n = scanner.nextInt();
        long fib = fibonacci(n);
        System.out.println(n + "th Fibonacci number is: " + fib);

        scanner.close();
    }
}