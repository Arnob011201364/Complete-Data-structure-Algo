import java.util.Arrays;
public class CopyArray {
          public static void printArray(int[] arr, int size) {
              for (int i = 0; i < size; i++) {
                  System.out.print(arr[i] + " ");
              }
              System.out.println();
          }
          static void changeArray(int []arr){
            for(int i = 0 ; i<arr.length;i++){
                arr[i] = 0;
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }    public static void main(String[] args) {
              int[] arr1 = {1, 2, 4, 5, 6};
              int[] arr2 = arr1;
              int arrClone[] = arr1.clone();
//using arrays copy of class
              int arrCopyof [] =  Arrays.copyOf(arr1, arr1.length);
              //another class is Arrays.copyOfRange(arr,from index to length);
              System.out.println("original array before changing :"); // fixed error: added closing quotes for the string literal
              printArray(arr1, arr1.length);
              printArray(arr2, arr2.length);
//shallow copy(original array wont copied just reference copy is being
//created and no memory allocated)
              arr2[1] = 10;
              arr2[3] = 44;
              System.out.println("original array after changing :"); // fixed error: added closing quotes for the string literal
              printArray(arr1, arr1.length);
              printArray(arr2, arr2.length);
              System.out.println("Original array after cloning");
              printArray(arr1, arr1.length);
              printArray(arrClone, arrClone.length);
              System.out.println("Original array after using copy of class");
              printArray(arr1, arr1.length);
              printArray(arrCopyof, arrCopyof.length);
 //new array declaration
              int arr3 [] = new int [3];
              arr3[0] = 1;
              arr3[1] = 2;
              arr3[2] = 3;
              System.out.println("changing output");
              changeArray(arr3);

          }
      }
      