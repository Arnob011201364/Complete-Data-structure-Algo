import java.util.*;
public class Main
{
	public static void main(String[] args) {
	  int count = 0;
	  System.out.println("Enter the number : ");
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  while(n>0){
	  n = n/10;
	  count++;
	}
	System.out.println("The number of digit is : "+count);
}
}