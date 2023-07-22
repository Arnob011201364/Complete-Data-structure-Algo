import java.util.*;
public class Main
{   public static int findArraySum(int arr[]){
    int totsum = 0;
    for(int i = 0; i<arr.length; i++){
        totsum = totsum+arr[i];
    }
    return totsum;
}
    public static boolean subarraySum(int arr[]){
        int totalSum = findArraySum(arr);
        int prefix = 0;
        for(int i = 0 ; i<arr.length;i++){
             prefix = prefix + arr[i];
             int suffix = totalSum - prefix;
             if(prefix == suffix){
                 return true;
             }
        }
        return false;
    }
    public static int[] prefixSum(int arr[], int n){
    for(int i = 1 ; i< n; i++){
            arr[i] = arr[i-1]+ arr[i];
        }
    return arr;
} 
    public static void printArray(int arr[]){
        for (int i = 0 ; i< arr.length; i++){
        System.out.println(arr[i]+" ");
    }
    }
	public static void main(String[] args) {
	System.out.println("enter size of the array : ");
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	int[] arr = new int[n];
	System.out.println("enter element of the array : ");
	for(int i = 0 ; i<  n ; i++){
	   arr[i] = sc.nextInt();
	}
    System.out.println("equalPartitionPossible :"+subarraySum(arr));
    //for showing true value we printed it
	
	}
	}
