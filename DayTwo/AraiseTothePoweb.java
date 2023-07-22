import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the number :- ");
	 int a = sc.nextInt();
	 int b = sc.nextInt();	 
	 int ans = 1;
	for(int i = 1; i<=b ;i++){
	    ans =  ans*a;//ans = 1; a = 2; ans = 1*2 =2
	}                //ans = 2; a = 2 ; ans = 2*2 =4
	                 //ans = 4; a = 2 ; ans = 4*2 =8
	 System.out.println(a+" to the power "+b+" : "+ans);
}}