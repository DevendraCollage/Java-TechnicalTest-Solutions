//* W.A.P. to read the size of square and character to print the square.
/*
 * #    #    #    #    #
 * #                   #
 * #                   #
 * #                   #
 * #    #    #    #    #

 */

// Import the required classes to implement the problem
import java.util.*;

public class Pro10 {
    public static void main(String[] args) {
        // Create the instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Read the size of the square from the user
        System.out.print("Enter the size of the Square : ");
        int size = sc.nextInt();
        // Read the character user want to print
        System.out.print("Enter the character : ");
        char squareChar = sc.next().charAt(0);

        // Implement the logic to print the square
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(squareChar + "     ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
