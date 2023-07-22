import java.util.*;

public class Main {
    public static void printArray(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("["+matrix[i][j] + "]"); // Changed println to print
            }
            System.out.println(); // Added a new line after each row
        }
    }
    public static void OneDTOTwoD(int a[], int n, int m) {
        int index = 0;// added index to iterate over 1D array
        int twoD[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                 twoD[i][j] = a[index++];
            }
        }
        printArray(twoD);
    }
    public static void main(String[] args) {
        System.out.println("Enter Matrix A:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        int a[] = new int[n*m];
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < n*m; i++) { 
                a[i] = sc.nextInt();
        }
     OneDTOTwoD(a,n,m);
    }
}
