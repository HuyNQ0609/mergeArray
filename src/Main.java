import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size1, size2;
        int[] arr1, arr2, arr3;

        //*---------Init Array1---------*/

        System.out.println("Enter a size: ");
        size1 = input.nextInt();
        arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter element array1 " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }

        //*---------Init Array2---------*/

        System.out.println("Enter a size: ");
        size2 = input.nextInt();
        arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter element array2 " + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }

        //*---------Browse Array3---------*/

        int length = arr1.length + arr2.length;
        int a = 0;
        arr3 = new int[length];
        for (int j: arr1) {
            arr3[a] = j;
            a++;
        }
        for (int j: arr2) {
            arr3[a] = j;
            a++;
        }
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));
        System.out.println("arr3: " + Arrays.toString(arr3));
    }
}