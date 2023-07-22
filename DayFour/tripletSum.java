import java.util.*;

public class Main {
    public static int tripletSum(int arr[], int size, int key) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                for (int k = j + 1; k < size; k++) {
                    if (arr[i] + arr[j] + arr[k] == key)
                        count++;
                }
            }
        }
        return count;
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
        int key = 12;
        System.out.println("The ans is : "+tripletSum(arr, size, key));
    }
}
