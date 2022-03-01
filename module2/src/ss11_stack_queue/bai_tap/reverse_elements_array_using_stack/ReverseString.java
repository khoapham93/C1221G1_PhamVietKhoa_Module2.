package ss11_stack_queue.bai_tap.reverse_elements_array_using_stack;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stringStack = new Stack<>();
        String inputString;
        String outputString = "";

        System.out.print("Enter a string:");
        inputString = scanner.nextLine();

        //standardized string
        inputString = inputString.trim();
        inputString = inputString.replaceAll("\\s+", " ");
        String[] stringToArray = inputString.split(" ");

        System.out.println("String before reverse:");
        System.out.println(inputString);
        
        for (String element : stringToArray) {
            stringStack.push(element);
        }
        for (int i = 0; i < stringToArray.length; i++) {
            outputString += stringStack.pop();
            outputString += " ";
        }

        System.out.println("String after reverse:");
        System.out.println(outputString);
    }
}
