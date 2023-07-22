import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number :- ");
	 int n = sc.nextInt();
	 int ans = 0;
	 while(n>=1){
	     if(n%2 == 1)
	     ans += n;
	     else 
	     ans -= n;
	     n--;
	 }
	    System.out.println("Sum of the series is : "+ans);
	}
}
