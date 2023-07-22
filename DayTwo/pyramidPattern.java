public class pyramidPattern {
    public static void main(String[] args) {
        int n = 153;
        int sum = 0;
        int temp = n ; 
        while(temp > 0) {
            int rem = n % 10; 
            sum = sum + rem*rem*rem;
            temp /= 10;
        }
       if(sum == n){
           System.out.println("Armstrong number");
       }else{
       System.out.println("not armstrong ");}
    }
}

