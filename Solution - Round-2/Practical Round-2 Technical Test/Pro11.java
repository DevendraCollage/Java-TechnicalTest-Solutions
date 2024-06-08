/*  An electricity board charges the following rates for the use of electricity: For the first 200 units
80 paisa per unit, For the next 100 units 90 paisa per unit and beyond 300 units Rs 1.00 per unit.
All users are charged minimum of Rs.100 as meter charge. If the total amount is more than Rs.
300 then an additional surcharge of 12.36% of total amount is charged. W.A.P. to read the
number of units consumed and print out the bill amount. */

// Import the required classes to implement the problem
import java.util.Scanner;

class Pro11 {
    public static void main(String[] args) {
        // Instance of the Scanner class
        Scanner sc = new Scanner(System.in);

        // Read the unit of the electricity from the user
        System.out.print("Enter the number of units consumed here : ");
        float userUnit = sc.nextFloat();
        System.out.println();

        // Apply the condition and get the amount of the bill
        float amount = 0;
        if (userUnit >= 0 && userUnit <= 200) {
            amount = userUnit * (float) 0.80; // For the first 200 units 80 paisa per unit
        } else if (userUnit > 200 && userUnit <= 300) {
            amount = userUnit * (float) 0.80 + userUnit * (float) 0.90;
        } else if (userUnit > 300) {
            amount = 200 * (float) 0.80 + 100 * (float) 0.90 + (userUnit - 300) * (float) 1.0;
        }
        double surcharge = 0;
        if (amount + 100 > 300) {
            surcharge = (amount + 100) * 0.1236;
        }

        // Print the bill of the user
        System.out.println("Minimum Meter Charge :  Rs.100");
        System.out.println("Your Monthly Unit usage is : " + userUnit);
        System.out.printf("Unit Usage Charge Is : Rs.%.2f\n", amount);
        System.out.println("Surcharge Amount on your bill : " + surcharge);
        System.out.println("-----------------------------------------------");
        System.out.println("Your Total Amount of the bill is : " + (amount + 100 + surcharge));

        sc.close();
    }
}