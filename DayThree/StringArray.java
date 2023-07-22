public class Main
{ //Convert a list of string into ans array of string and print all 
//strings stored in odd index
	public static void main(String[] args) {
		String[] arr = {"ab","bc","de","fg","gh","ij","jk"};
		for(int i = 0 ; i<arr.length;i++){
		    if(i % 2 != 0){
		    System.out.print(arr[i]+",");
		    }
		}
	}
}
