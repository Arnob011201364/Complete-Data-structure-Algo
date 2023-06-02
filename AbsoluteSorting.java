import java.util.*;

public class AbsoluteSorting {
    public static int[] sorting(int arr[]) {
        int left = 0;
        int right = arr.length - 1;
        int ans[] = new int[arr.length];
        int k = 0;

        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                swap(arr, left, right);
                ans[k++] = (arr[left] * arr[left]);
                left++;
            } else {
                ans[k++] = (arr[right] * arr[right]);
                right--;
            }
        }
        return ans;
    }

    public static void swap(int arr[], int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {-3, -2, -1, 0, 1, 5, 7};
        int[] ans = sorting(arr);
        System.out.println("Sorted array:");
        printArray(ans);
    }
}
