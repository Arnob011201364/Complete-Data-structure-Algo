import java.util.*;
public class Main
{   public static int[] prefixSum(int arr[], int n){
    int[] pref = new int[n];
    pref[0] = arr[0];
    for(int i = 1 ; i<n; i++){
            pref[i] = pref[i-1]+arr[i]; 
    }
    return pref;
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
	for(int i = 0 ; i< n ; i++){
	   arr[i] = sc.nextInt();
	}
	int[] pref = prefixSum(arr,n);
	System.out.println("The prefixSum is : ");
	printArray(pref);
	}
}
//without creating extra space 
/*
import java.util.*;
public class Main
{   public static int[] prefixSum(int arr[], int n){
    for(int i = 1 ; i<n; i++){
            arr[i] = arr[i-1]+arr[i]; 
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
	for(int i = 0 ; i< n ; i++){
	   arr[i] = sc.nextInt();
	}
    prefixSum(arr,n);
	System.out.println("The prefixSum is : ");
	printArray(arr);
	}
}
*/