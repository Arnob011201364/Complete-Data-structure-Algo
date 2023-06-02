package Day1;
//brute force approach
class ZeroOne {
          static int count = 0;
          public static void ZeroOne(int arr[]){
          for(int i = 0 ; i<arr.length ; i++){
              if(arr[i] == 0)
              count++;
          }    
}        static void sorting(int arr[]){
          for(int i = 0 ;i <arr.length ; i++){
          if(i<count){
          System.out.print(0+" ");
          }
          else{
          System.out.print(1+" ");
          }
}
}
          public static void main(String[] args) {
          int arr[] = {0,0,1,1,1,1,0,0,0} ; 
          ZeroOne(arr);
          sorting(arr);
          }

}
