import java.util.*;

public class Main {
    public static int RepeatedNumber(int arr[]) {
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
           for(int j = i+1; j<arr.length; j++){
               if(arr[i] == arr[j])
               ans = arr[i];
               return ans;//imediately stops the method ans go to where it called
      //break statement only use to break only one iteration//return arr[i]
           }
        }
        return ans;//return -1
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
        System.out.println("The repeated number is : "+ RepeatedNumber(arr));
    }
}
