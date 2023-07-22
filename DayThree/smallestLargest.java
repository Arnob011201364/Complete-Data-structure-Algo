import java.util.Arrays;
import java.util.Scanner;
public class Main {
    // Find smallest and largest elements in an array
    public static int[] smallestLargest(int[] arr, int size) {//return an Array
        Arrays.sort(arr);//array sorting function
        int ans[] = {arr[0], arr[size - 1]};//new array creation size of two
        return ans;
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
        int[] res = smallestLargest(arr, size);//for catch the value of an array it must be an array
        System.out.println("Smallest element: " + res[0]);
        System.out.println("Largest element: " + res[1]);
    }
}

