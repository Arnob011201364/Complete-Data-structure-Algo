public class patternAll {
    public static void printPattern1(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void printpattern2() {
        int i, j;
        int row = 5;
        for (i = 1; i <= row; i++) {
            for (j = i; j < row; j++)
                System.out.print(" ");
            for (j = 1; j <= i; j++)
                System.out.print(j + "");
            for (j = i - 1; j >= 1; j--)
                System.out.print(j + "");
            System.out.println();
        }
    }
    public static void crossPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || (i + j) == (n + 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void invertedPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void invertedHalfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void zeroOnepattern(int n){
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1; j<=i ;j++){
                if((i+j)%2==0)
                System.out.print("0");
                else
                System.out.print("1");
            }System.out.println();
        }
    }
    public static void numericalAlphabet(int n){
        for(int i =1 ; i<=n ; i++){
            for(int j = 1 ; j<=i;j++){
                if(i%2==1)
                System.out.print(j+" ");
                else
                System.out.print((char)(j+64)+" ");
            }System.out.println();
        }
    }
    public static void characterPattern(int n){
        char ch = 'A';
        for(int i = 1 ; i<=n ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void rhormus(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1; j<= n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n;j++){
            System.out.print("*");
            }System.out.println();
        }}
    public static void butterflyPattern(int n){
                for(int i = 1; i<=n ; i++){
                    for(int j= 1;j<=i;j++){
                        System.out.print("*");
                    }
                    for(int j = 1; j<=2*(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j= 1; j<=i ;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                for(int i = n-1; i>=1 ; i--){
                    for(int j= 1;j<=i;j++){
                        System.out.print("*");
                    }
                    for(int j = 1; j<=2*(n-i);j++){
                        System.out.print(" ");
                    }
                    for(int j= 1; j<=i ;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }
    public static void main(String[] args) {
        int numRows = 3;
        printPattern1(numRows);
        printpattern2();
        crossPattern(numRows);
        System.out.println();
        invertedHalfpyramid(numRows);
        System.out.println();
        invertedPattern(numRows);
        zeroOnepattern(numRows);
        numericalAlphabet(numRows);
        characterPattern(numRows);
        rhormus(numRows);
        butterflyPattern(numRows);

    }
}
