public class Utilities {
    // Exercise 1:
    // Calculations to find the position of the first repeated character in a string
    public static int getFirstRepeatedCharacter(String text) {
        if (text == null || text.isEmpty()) {
            return -1;
        }

        // Loop through each character in the string
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check the rest of the string for the same character
            for (int j = i + 1; j < text.length(); j++) {
                if (currentChar == text.charAt(j)) {
                    // Repeated character found; return the position of its first occurrence
                    return i;
                }
            }
        }
        // No repeated characters found
        return -1;
    }

    // Method for Question 2
    public static void goDownToOne(int startNumber) {
        if (startNumber <= 0) {
            System.out.println("Please enter a positive integer greater than zero.");
            return;
        }

        int number = startNumber;

        // Print the starting number
        System.out.print(number);

        // Continue looping until the number becomes 1
        while (number != 1) {
            if (number % 2 == 0) {
                // If the number is even, divide by 2
                number = number / 2;
            } else {
                // If the number is odd, multiply by 3 and add 1
                number = number * 3 + 1;
            }
            // Print the new value of the number
            System.out.print(" " + number);
        }
        // Move to the next line after finishing
        System.out.println();
        }
    }