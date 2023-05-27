public class rotateArray2{
    static void swap(int arr[], int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    static void rotate(int arr[], int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void rotateArray(int arr[], int k) {
        int n = arr.length;
        k = k % n;
        rotate(arr, 0, n - k - 1);
        rotate(arr, n - k, n - 1);
        rotate(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 3;
        rotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
