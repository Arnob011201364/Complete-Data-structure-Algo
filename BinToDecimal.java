class BinToDecimal{
public static void main(String[] args) {
          int ans = 0;
          int  pw = 1;
          int bin = 1011;
 while(bin>0){
          int unit_digit = bin%10;//it will bring last digit
          ans = ans + unit_digit*pw;
          bin = bin/10;
          pw = pw * 2;// 2*0 = 1 ; 1* 2= 2 //1*2*2

 }
 System.out.println("After conversion : "+ans);         
}
}