//* Given two string needle and haystack, return the index of the first occurrence of needle in
//* haystack, or - 1 if needle is not part of haystack.

//? Import required class to perform this problem
import java.util.Scanner;

public class Pro1 {
    public static void main(String[] args) {
        // * Create the instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // * Get the string from the user (needle and haystack)
        System.out.print("Enter the string haystack : ");
        String haystack = sc.nextLine();
        System.out.print("Enter the string needle : ");
        String needle = sc.nextLine();

        // ? Calculate the index of the needle string in haystack and haystack in the
        // needle
        int indexStr = haystack.indexOf(needle);

        // ? Print the index of the needle string in haystack
        System.out.println(
                "The index of the first occurrence of \"" + haystack + "\" in \"" + needle + "\" is " + indexStr);

        sc.close();
    }
}