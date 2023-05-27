public class sumOfpair {
          public static void printArray(int arr[],int key){
          for(int i = 0 ; i<arr.length;i++){
          for(int j = i+1; j<arr.length;j++){
          if( arr[i] + arr[j] == key){
          System.out.println("found at index : ["+i+","+j+"]");
                                       }
                                       
                              }
                    }
          }
          public static void main(String[] args) {
          int arr[] = {1,2,4,5};
          int key = 9;
          printArray(arr,key);
          }
          
}
