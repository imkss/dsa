package _Basic;

//Write a program to print all the unique characters in a String.
//For instance, if the input string is “abcb”,
//the output will be the characters ‘a’ and ‘c’ as they are unique.
//The character ‘b’ repeats twice and so it will not be printed.

import java.util.HashMap;
import java.util.Map;
public class UnqCh {
    public static void main(String[] args) {
        String inputString = "abcbb";
        printUniqueCharacters(inputString);
    }
    public static void printUniqueCharacters(String str) {
        // Create a map to store character occurrences
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Traverse the string and update the character occurrences
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print unique characters
        System.out.print("Unique characters: ");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
