package Day1;
import java.util.Arrays;
public class EvenOddSorting {
          static void swap(int arr[],int left , int right ){
                    int temp =   arr[left];
                     arr[left] =  arr[right];
                     arr[right] = temp;
           }
          public static void sorting(int[] arr){
                    int left = 0;
                    int right = arr.length;
                    while(left<right)//left<=right both are fine
                    {
                              if(arr[left]%2 == 1 && arr[right]%2==0){
                                        swap(arr,left,right );
                                        left++;
                                        right--;
                              }
                              if(arr[left]%2==0)
                              left++;
                              if(arr[right]%2==1)
                              right--;
                    }
          }
          public static void printArray(int arr[]) {
                    for (int num : arr) {
                        System.out.print(num + " ");
                    }
                }
            
                public static void main(String[] args) {
                    int arr[] = {2, 5, 3, 6, 9, 8, 6, 2, 1};
                    sorting(arr);
                    System.out.println("Sorted array:");
                    Arrays.sort(arr);
                    printArray(arr);         
}
}
