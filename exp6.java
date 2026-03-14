// Write a Java program to generate a 
multiplication table using a two-dimensional array


import java.util.Scanner;

public class MultiplicationTable2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the size of the table
        System.out.print("Enter the size of the multiplication table: ");
        int n = sc.nextInt();

        // Declare 2D array
        int[][] table = new int[n][n];

        // Generate multiplication table
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        // Display the table
        System.out.println("Multiplication Table:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + "\t"); // tab for formatting
            }
            System.out.println();
        }

        sc.close();
    }
}