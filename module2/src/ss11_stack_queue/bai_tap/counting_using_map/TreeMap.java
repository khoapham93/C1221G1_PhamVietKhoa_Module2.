package ss11_stack_queue.bai_tap.counting_using_map;

import java.util.Map;
import java.util.Scanner;

public class TreeMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter String:");
        String inputString = scanner.nextLine();
        //Replace all blanksapce.
        inputString = inputString.replaceAll(" ", "");

        Map<String, Integer> treeMap = new java.util.TreeMap<>();
        String charInString;
        for (int i = 0; i < inputString.length(); i++) {
            charInString = Character.toString(inputString.charAt(i)).toUpperCase();

            if (!treeMap.containsKey(charInString)) {
                treeMap.put(charInString, 1);
            } else {
                int charValue = treeMap.get(charInString) + 1;
                treeMap.put(charInString, charValue);
            }
        }
        System.out.println("Count occurrences of a character in string:");
        for (Map.Entry element : treeMap.entrySet()) {
            System.out.println(element.getKey() + ": " + element.getValue());
        }
    }
}
