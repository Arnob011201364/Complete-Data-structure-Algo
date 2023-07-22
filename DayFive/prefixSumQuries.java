import java.util.*;
public class Main
{   public static int[] prefixSum(int arr[], int n){
    for(int i = 1 ; i< n; i++){
            arr[i] = arr[i-1]+ arr[i];
        }
    return arr;
} 
    /*public static void printArray(int arr[]){
        for (int i = 0 ; i< arr.length; i++){
        System.out.println(arr[i]+" ");
    }
    }*/
	public static void main(String[] args) {
	System.out.println("enter size of the array : ");
	Scanner sc = new Scanner(System.in);
	int n  = sc.nextInt();
	int[] arr = new int[n+1];
	System.out.println("enter element of the array : ");
	for(int i = 1 ; i<= n ; i++){
	   arr[i] = sc.nextInt();
	}
	int[] pref = prefixSum(arr,n);
	System.out.println("enter number of quieres : ");
	int q = sc.nextInt();
	while(q -- >0){
	    System.out.print("enter range :");
	    //l and r follow 1-based indexing
	    int l = sc.nextInt();
	    int r = sc.nextInt();
	    int ans = pref[r] + pref[l-1];
	    System.out.println("the prefix sum of given quieres : "+ans);
	    
	}
	}
}