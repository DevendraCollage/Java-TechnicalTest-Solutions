// 13	Accept three integer values from the user and display them in ascending order using only operators (i.e. without using if…else, switch case, or loop).

// Import the required classes to implement the problem
import java.util.*;

public class Pro13 {
    public static void main(String[] args) {
        // Instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Read the three numbers from the user
        System.out.print("Enter the number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("Enter the number 2 : ");
        int n2 = sc.nextInt();
        System.out.print("Enter the number 3 : ");
        int n3 = sc.nextInt();

        // Implement the logic without using without using if…else, switch case, or loop
        int first, second, third;

        third = Math.max(n1, Math.max(n2, n3)); // This will give the third number
        first = (-1) * Math.max(-n1, Math.max(-n2, -n3));
        second = n1 ^ n2 ^ n3 ^ first ^ third;

        // ! Wrong Logic
        // first = (n1>n2) ? (n1>n3 ? n1 : n3) : (n2>n3 ? n2 : n3);
        // second = (n3>n1) ? (n2>n1 ? n2 : n1) : (n3>n1 ? n3 : n1);
        // third = (n2>n3) ? (n3>n2 ? n3 : n2) : (n2>n3 ? n2 : n3);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        sc.close();
    }
}
