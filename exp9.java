//Write a Java program to demonstrate 
user-defined methods by calculating the area of a circle 
and finding the maximum of three numbers. 



import java.util.Scanner;

public class UserDefinedMethodsDemo {

    // Method to calculate the area of a circle
    public static double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int num1, int num2, int num3) {
        int max = num1; // assume num1 is max initially
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: Area of a circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double area = calculateCircleArea(radius);
        System.out.println("Area of the circle: " + area);

        // Part 2: Maximum of three numbers
        System.out.println("\nEnter three numbers to find the maximum:");
        System.out.print("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = scanner.nextInt();

        int maximum = findMaximum(num1, num2, num3);
        System.out.println("Maximum number is: " + maximum);

        scanner.close();
    }
}