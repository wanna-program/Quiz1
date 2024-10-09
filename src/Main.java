import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter text
        System.out.print("Enter text to check for repeated characters: ");
        String userInput = scanner.nextLine();

        // Call the getFirstRepeatedCharacter method from Utilities class
        int position = Utilities.getFirstRepeatedCharacter(userInput);

        // Prompt the result
        if (position != -1) {
            System.out.println("First repeated character is at position: " + position);
        } else {
            System.out.println("No repeated characters found.");
        }


        // Testing goDownToOne method (Question 2)
        System.out.print("\nEnter a starting number for goDownToOne: ");
        int startNumber = scanner.nextInt();

        System.out.print("Sequence: ");
        Utilities.goDownToOne(startNumber);

        scanner.close();
    }



        }
    }
}
