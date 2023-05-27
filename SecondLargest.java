import javax.swing.plaf.TextUI;

public class SecondLargest {
          static int maxNumber(int arr[]) {
              int mx = Integer.MIN_VALUE;
              for (int i = 0; i < arr.length; i++) {
                  if (arr[i] > mx)
                      mx = arr[i];
              }
              return mx;
          }
          static int SecondLarge(int arr[]) {
              int max = maxNumber(arr);
              for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == max)
                      arr[i] = Integer.MIN_VALUE;
              }
              int ans = maxNumber(arr);
              return ans;
          }
          public static void main(String[] args) {
              int arr[] = {1, 2, 3, 4, 5, 6};
              System.out.println(SecondLarge(arr));
          }
      }
      