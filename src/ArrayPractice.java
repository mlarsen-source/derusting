public class ArrayPractice 
{
  public static void main(String[] args) 
  {
    // Create an array of Strings of size 4
    String[] newArray = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    newArray[1] = "string1";
    newArray[2] = "string2";
    newArray[3] = "string3";
    newArray[4] = "string4";

    // Get the value of the array at index 2

    String value = newArray[2];

    // Get the length of the array

    int length = newArray.length;

    // Iterate over the array using a traditional for loop and print out each item

    for(int i=0; i<newArray.length; i++)
    {
      System.out.println(newArray[i]);
    }

    // Iterate over the array using a for-each loop and print out each item
    for(String word: newArray)
    {
      System.out.println(word);
    }
    
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
