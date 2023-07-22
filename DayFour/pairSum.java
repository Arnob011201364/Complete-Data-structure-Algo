import java.util.*;
public class Main
{   public static int  targetSum(int arr[] , int size , int key){
    int ans = 0;
    for(int i = 0 ; i< size ;i++){
        
        for(int j = i+1 ; j<size ; j++){
            if(arr[i]+arr[j] == key)
            ans++;
        }
    }return ans;
}
	public static void main(String[] args) {
		System.out.println("Enter size of the array : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter element of the array : ");
		for(int i = 0 ; i<n ; i++){
		    arr[i] = sc.nextInt();
		}
		int key = 9;
		System.out.println(targetSum(arr,n, key));//if we dont print it return ans wont show its output
		
	}
}
