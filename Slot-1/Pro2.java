//* Design a stack that supports tha push, pop, top, and retrieving the minimum element in constant time.

//? Import the required the classs
import java.util.*;

class MinStack {

    // ? Initialize the stack
    Stack<Integer> s1;

    public MinStack() { // This is the constructor of the class
        s1 = new Stack<Integer>();
    }

    // ? Push method
    public void push(int item) {
        s1.push(item); // * This will push the elements to the stack
    }

    // ? Pop method
    public void pop() {
        System.out.println(s1.pop());
    }

    // ? Top method
    public void top() {
        System.out.println(s1.peek());
    }

    // ? Minimum method
    public void getMin() {
        if (s1.isEmpty()) { // This condition will check if stack is empty or not
            System.out.println("Underflow");
        }
        Iterator<Integer> itr = s1.iterator(); // ! This is the Iterator class this will iterate items of the stack like
                                               // loop
        int minElem = s1.peek(); // ? This will store the peek element of the stack
        while (itr.hasNext()) { // ? This loop will check iterator will has next elements then run the loop
            int x = itr.next(); // ? This will store every time next element of the stack
            if (x < minElem) { // ? This will check the condition if x is less than peek element then this will
                               // ? change the element by that element
                minElem = x;
            }
        }
        System.out.println("The minimum element is : " + minElem);
    }
}

public class Pro2 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();

        // todo Push the elements to the stack
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        // todo Get the minimum elements from the stack
        minStack.getMin(); // Output: -3
        // todo Pop the element from the stack
        minStack.pop();
        // todo Get the top element
        minStack.top(); // Output: 0
        // todo Get the minimum elements from the stack
        minStack.getMin(); // Output: 0

        // Print the stack for check the elements of the stack
        System.out.println("Stack: " + minStack.s1);
    }
}
