package Day1;
public class ZeroOneSorting2 {
          // optimal approach
          static void swap(int arr[], int left, int right) {
              int temp = arr[left];
              arr[left] = arr[right];
              arr[right] = temp;
          }
      
          static void sorting(int arr[]) {
              int left = 0;
              int right = arr.length - 1;
              while (left < right) {
                  if (arr[left] == 1 && arr[right] == 0){
                      swap(arr, left, right);
                  left++;
                  right--;
                  }
              if (arr[left] == 0) {
                  left++;
              }
              if (arr[right] == 1) {
                  right--;
              }
          }
}
          public static void printArray(int arr[]) {
              for (int num : arr) {
                  System.out.print(num + " ");
              }
          }      
          public static void main(String[] args) {
              int arr[] = {0, 0, 1, 1, 1, 1, 0, 0, 0};
              sorting(arr);
              System.out.println("Sorted array:");
              printArray(arr);
          }
      }