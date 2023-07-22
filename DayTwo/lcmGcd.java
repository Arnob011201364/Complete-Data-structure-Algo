public class Main {
public static void main(String[] args) {
int a = 36;
int b = 24;
int or1 = a;
int or2 = b;
while(a%b != 0){
        int rem = a%b;
        a = b;
        b = rem;
}
int gcd = b;
int lcm = (or1 * or2)/gcd;
System.out.println(gcd);
System.out.println(lcm);
}
}