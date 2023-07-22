public class Main
{ //travese even element of an array using for each loop
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		for(int num : arr){
		    if(num % 2 == 0){
		    System.out.print(num+" ");
		    }
		}
	}
}