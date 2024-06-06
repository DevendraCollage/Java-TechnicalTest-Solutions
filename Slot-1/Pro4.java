//* Given an integer n, return the nth digit of the infinite sequence
//* [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, ...].

//? Import required class for implement the solution.
import java.util.Scanner;

public class Pro4 {
    public static int findDigit(int n) {
        int count = 0; // ? Counter to keep track of the number of digits encountered
        int digit = 0; // ? Variables to store the current digit
        int base = 1; // ? Base value for the current digit (e.g., 1 for 1-9, 10 for 10-99, etc)

        while (count < n) {
            // ? Calculate the number of digits in the current base
            int digitsInBase = (int) Math.pow(10, (base + "").length() - 1) * 9 * (base + "").length();

            // ! Check if the target digit is within the current base
            if (count + digitsInBase >= n) {
                // ? The target digit is within the current base
                int offSet = (n - count - 1) / (base + "").length(); // ? Offset from the starting number of the current
                digit = Integer.parseInt((base + offSet) + "") % 10; // ? extract the target digit
                break;
            }

            count = count + digitsInBase; // ? Update the count
            base = base * 10; // ? Move to the next base
        }
        return digit;
    }

    public static void main(String[] args) {
        // * Create the instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // * Read the input from the user
        System.out.print("Enter the number here to find the nth digit : ");
        int nthDigit = sc.nextInt();

        // * Call the function and pass the number entered by the user
        System.out.println(findDigit(nthDigit));

        sc.close();
    }
}