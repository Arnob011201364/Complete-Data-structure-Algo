public class lastOccurence {
   public static void CountlastOccurence(int arr[], int key) {
      int lastIndex = -1;
      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == key) {
            lastIndex = i;
         }
      }
      System.out.println("last occurence in the index of at " + lastIndex);
   }

   public static void main(String[] args) {
      int arr[] = { 5, 2, 5, 0, 5 };
      int key = 5;
      CountlastOccurence(arr, key);
   }
}
