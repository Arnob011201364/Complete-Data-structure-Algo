public class Main
{ //print only positive value ans index in an array
	public static void main(String[] args) {
		int[] arr = {-2,6,5,-7,8,1,-9};
		int ans = 0;
		for(int i = 0 ; i<arr.length;i++){
		    if(arr[i] > 0){
		    ans = i;
		    //System.out.println(ans+" ");
		    System.out.println(arr[i]);
		    }
		}
	}
}
