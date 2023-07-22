public class Main {
    public static void main(String[] args) {
        int rows = 5;
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            
            // Print numbers and spaces
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1|| i==5) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
    }
}
