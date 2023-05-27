//swaping without temp
class swapNotemp{
          public static void swapwithouttemp( int a, int b ){
                              a = a+b; //9+3
                              b = a-b; //12-3 = 9
                              a = a-b; //12-9 = 3
          System.out.println("after swaping a is :"+a);
          System.out.println("after swaping b is :"+b);
          }
          public static void main(String[]args){
                             int a = 9;
                             int b = 3;
                             swapwithouttemp(a,b);
                    }
          }