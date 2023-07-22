import java.util.*;

public class Main {
    // last occurrence in an Array
    public static boolean sortedOrNot(int[] arr, int size) {
        boolean check = true;
        for (int i = 1; i < size; i++) {
            if (arr[i-1] > arr[i]){
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sortedOrNot(arr,size));
        
    }
}