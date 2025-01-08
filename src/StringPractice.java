import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable

    String name = "Matthew";
    System.out.println(name);

    // Find the length of the string

    int length = name.length();
    System.out.println("length: " + length);


    // Concatenate (add) two strings together and reassign the result

    String word1 = "hello";
    String word2 = "world";
    String word3 = word1 + word2;
    System.out.println(word3);

    // Find the value of the character at index 3

    char value = word3.charAt(3);
    System.out.println("character at index 3: " + value);


    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)

    boolean contains = word3.contains("low");
    System.out.println(contains);

    // Iterate over the characters of the string, printing each one on a separate line

    for (int i = 0; i < word3.length(); i++) 
    {
      System.out.println(word3.charAt(i));
    }

    // Create an ArrayList of Strings and assign it to a variable

    List<String> newList = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)
    newList.add("apple");
    newList.add("banana");
    newList.add("strawberry");
    newList.add("orange");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop

    String joined = String.join(", ", newList);
    System.out.println(joined);

    // Check whether two strings are equal

    boolean test = word1.equals(word2);
    System.out.println(test);

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
