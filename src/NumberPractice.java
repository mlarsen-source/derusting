public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable

    float num1 = -42.3f;
    System.out.println(num1);

    // Create an int with a positive value and assign it to a variable

    int num2 = 7;
    System.out.println(num2);

    // Use the modulo % operator to find the remainder when the int is divided by 3

    int remainder = num2 % 3;
    System.out.println(remainder);

    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    if (num2 % 2 == 0)
    {
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }

    // Divide the number by another number using integer division

    int sum = num2 / 3;
    System.out.println(sum);
    

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
