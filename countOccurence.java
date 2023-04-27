public class countOccurence {
       public static void CountOccurence(int arr[] , int key){
          int count = 0;
          for(int i = 0 ; i<arr.length; i++){
             if(arr[i] == key){
                    count++;
             }
          }
          System.out.println("Total number of occurences : "+count);
       }
       public static void main(String[] args) {
             int arr[] = {1,2,3,4,5,5,5};
             int key = 5;
             CountOccurence(arr,key);
                    
          }
          
}
