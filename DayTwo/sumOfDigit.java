import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numebr :- ");
		int x = sc.nextInt();
		int ans = 0;
		while (x>0){ 
		int rem = x%10;
		ans = ans + rem ;
		x = x/10;
	}
	System.out.println("The sum of digit is : "+ans);
}
}
