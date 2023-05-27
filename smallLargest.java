import java.util.Arrays;
public class smallLargest {
    static int[] findSmallestLargest(int arr[]) {
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length - 1]};//ans is a two element array
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 1, 2};
        int[] ans = findSmallestLargest(arr);
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);
    }
}
