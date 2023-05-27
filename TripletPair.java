public class TripletPair {
          public static void printArray(int arr[], int key) {
              for (int i = 0; i < arr.length; i++) {
                  for (int j = i + 1; j < arr.length; j++) {
                      for (int k = j + 1; k < arr.length; k++) {
                          if (arr[i] + arr[j] + arr[k] == key) {
                              System.out.println("Found at index: [" + i + "," + j + "," + k + "]");
                          }
                      }
                  }
              }
          }
          public static void main(String[] args) {
              int arr[] = { 1, 2, 3, 5 };
              int key = 9;
              printArray(arr, key);
          }
      }
      