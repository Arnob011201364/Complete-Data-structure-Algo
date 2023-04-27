//count strictly greater than a key element
public class coutStrictlyGreater {
    public static void countgreater(int arr[] , int key){
         int count = 0 ;
         for(int i = 0 ; i<arr.length;i++){
          if(arr[i] > key){
              count++;
          }
         }
         System.out.println("The number of sticly greater element is :"+count);
    }
    public static void main(String[] args) {
          int arr[] = {1,4,5,6,7,8,9,10};
          int key = 5;   
          countgreater(arr, key);       
          }
          
}
