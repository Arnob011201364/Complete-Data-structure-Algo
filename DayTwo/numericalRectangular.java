import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int row = sc.nextInt();
	for(int i = 1; i<=row ;i++){
	    for(int j = i ; j<=row;j++){
	        System.out.print(j);
	    }
    for(int j = 1 ; j<=i-1;j++){
	        System.out.print(j);
	    }
	    System.out.println();
	}
	}
}
