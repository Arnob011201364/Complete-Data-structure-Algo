public class reverseArray {
          static void arrayReverse1(int arr[]){
          for(int i = arr.length-1 ; i>=0;i--)
          System.out.print(arr[i]+" ");
          }
          //reverse array using another array
          static int[] arrayReverse2(int arr[]){   
          int n = arr.length;
          int ans[] = new int[n];    
          int j = 0;
          for(int i = n-1 ; i>=0;i--){
          ans[j++] = arr[i];
          }
          for (int i = 0; i < n; i++){
          System.out.print(ans[i] + " ");
          }
          return ans;
}
//optimal way to solve reverse array without using another variable
          static int[] arrayReverse3(int arr[]){
          int i = 0;
          int j = arr.length-1;
          while(i<j){
              int temp = arr[i];
              arr[i] = arr[j];
              arr[j] = temp;
              i++;
              j--;     
          }
          return arr;

          }
          public static void main(String[] args) {
          int arr [] = {1,2,3,4,5};
          arrayReverse1(arr);   
          int[] ans = arrayReverse2(arr);       
          int[] ans2 = arrayReverse3(arr);
          System.out.println();
          for(int i = 0 ; i<arr.length-1;i++){
                    System.out.println(ans2[i]+" ");
          }
          }
}
