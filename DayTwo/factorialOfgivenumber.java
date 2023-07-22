import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int fact =1;
	 int i;
	 System.out.println("enter the number :- ");
	 int n = sc.nextInt();
	 for(i = 1 ; i < n; i++){
	    fact = fact*i;
	}
	 System.out.println("factorial of "+i+ " is : "+fact);
}
}
