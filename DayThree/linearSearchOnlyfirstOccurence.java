public class Main
{ //find a given element
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,2};
		int ans = -1 ;
		int key = 2;
		for(int i = 0 ; i<arr.length;i++){
		    if(arr[i] == key){
		    ans = i;
		    break;//if i dont use break then it will print 7      
		    }
		}
	}
}
