//* Given an integer n, return the number of trailing zeros in n!.

//? Import the required class to implement this problem
import java.util.Scanner;

public class Pro3 {

    // ! Function for calculating factorial of the given number
    // ! The Wrong Logic
    // public static BigInteger factorial(int num){
    // if (num<=1) {
    // return BigInteger.ONE;
    // }else{
    // return factorial(num-1).multiply(BigInteger.valueOf(num));
    // }
    // }

    public static void main(String[] args) {
        // * Create the instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // * Read the number from the user
        System.out.print("Enter the number here : ");
        int num = sc.nextInt();

        int n1 = num; // ? Store the copy of the original number
        int zeroCount = 0; // ? This will store the count of the trailing zeros

        // * Loop through to count the trailing zeros
        // ! This is the right logic of the calculate the trailing zeros of the given
        // factorial
        while (num != 0) {
            zeroCount = zeroCount + num / 5; // ? Count the number of trailing zeros by dividing 'num' by 5 and
                                             // accumulating the result
            num = num / 5; // ? Reduce 'n' by dividing it by 5 for the next iteration
        }

        // * Print the result of the giving number
        System.out.printf("The trailing zeros of the given number of the factorial %d = %d", n1, zeroCount);

        sc.close();
    }
}
