// W.A.P. to read n numbers in an array and remove the duplicates from an array.
// Incomplete

// Import the required classes to implement the problem
import java.util.*;

public class Pro9 {
    public static void main(String[] args) {
        // Instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Read the size from the user
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();

        // Implement the array and read the elements of the array from the user
        int[] arr = new int[size];

        // Get the length of the array
        int len = arr.length;
        // System.out.print(len);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d] : ", i);
            arr[i] = sc.nextInt();
        }
        System.out.println();

        // print the array before the removing duplicates
        System.out.println("Before remove duplicates : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        int j = 0;
        for (int i = 0; i < len; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < i; k++) {
                if (arr[i] == arr[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                arr[j++] = arr[i];
            }
        }

        // Print the array after the removing duplicates
        System.out.println("After remove duplicates : ");
        for (int i = 0; i < j; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();

        sc.close();
    }
}
