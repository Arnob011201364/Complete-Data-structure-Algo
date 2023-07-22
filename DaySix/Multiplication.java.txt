import java.util.*;

public class Main {
    public static void printArray(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " "); // Changed println to print
            }
            System.out.println(); // Added a new line after each row
        }
    }

    public static int[][] multiply(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong Input: No multiplication possible");
            return null; // Return null instead of void
        }
        int mult[][] = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) { // Changed c1 to r2
                    mult[i][j] = mult[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        return mult;
    }

    public static void main(String[] args) {
        System.out.println("Enter Matrix A:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter r1: ");
        int r1 = sc.nextInt();
        System.out.print("Enter c1: ");
        int c1 = sc.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter Matrix B:");
        System.out.print("Enter r2: ");
        int r2 = sc.nextInt();
        System.out.print("Enter c2: ");
        int c2 = sc.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int[][] multiplication = multiply(a, r1, c1, b, r2, c2);
        if (multiplication != null) {
            System.out.println("Matrix Multiplication Result:");
            printArray(multiplication);
        }
    }
}
