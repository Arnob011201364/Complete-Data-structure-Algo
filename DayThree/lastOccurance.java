import java.util.*;

public class Main {
    // last occurrence in an Array
    public static int lastOccurrence(int[] arr, int size) {
        int key = 2;
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == key)
                index = i;
        }
        return index;
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
        System.out.println("Index found at : "+lastOccurrence(arr,size));
     
    }
}