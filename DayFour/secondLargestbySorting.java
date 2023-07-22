import java.util.*;
public class Main {
    public static int secondLargest(int arr[], int size) {
            int ans = 0;
            Arrays.sort(arr);
            for (int i = 0; i < size; i++) {
            arr[size - 1] = -1;
            }
            Arrays.sort(arr);
            for (int i = 0; i < size; i++) {
             arr[i] = arr[size-1];//arr[i] now conatains the secondLargest element 
             ans = arr[i];
            }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The second largest element is : " + secondLargest(arr, size));
    }
}
