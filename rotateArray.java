public class rotateArray {
          static int[] rotateArray(int arr[], int k) {
              int i = 0;
              int n = arr.length;
              k = k % n;
              int[] ans = new int[n];
              for (i = n - k; i < n; i++) {
                  System.out.println(arr[i] + " ");
              }
              for (i = 0; i < n - k; i++) {
                  System.out.println(arr[i] + " ");
              }
              return arr;
          }
          //using less space
                          public static void main(String[] args) {
              int[] arr = { 1, 2, 3, 4, 5 };
              int kstep = 3;
              int[] ans = rotateArray(arr, kstep);

          }
      }
      