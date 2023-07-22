import java.util.*;

public class Main {
    public static int max(int arr[]) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx)
                mx = arr[i];
        }
        return mx;
    }
    public static int secondLargest(int arr[]) {
        int mx = max(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx)
                arr[i] = Integer.MIN_VALUE;
        }
        int secondLarge = max(arr);
        return secondLarge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element is: " + secondLargest(arr));
    }
}
