public class Book {

    // Attributes
    private String summary;
    private int numberOfPages;

    // Constructor
    public Book(String summary, int numberOfPages) {
        this.summary = summary;
        this.numberOfPages = numberOfPages;
    }

    // Getter and Setter for 'summary'
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    // Getter and Setter for 'numberOfPages'
    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    // Question 5: Method to check if there are repeating characters in the summary
    public boolean isRepeatingSummary() {
        int position = getFirstRepeatedCharacter(summary);
        return position != -1;
    }

    // Private method using getFirstRepeatedCharacter from Utilities
    private int getFirstRepeatedCharacter(String text) {
        // Null or empty check
        if (text == null || text.isEmpty()) {
            return -1;
        }

        // Loop through each character
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if this character appears again in the rest of the string
            for (int j = i + 1; j < text.length(); j++) {
                if (currentChar == text.charAt(j)) {
                    return i; // Return the position of the first occurrence
                }
            }
        }
        return -1; // No repeating characters found
    }

    // Question 6: Method to show pages to read using goDownToOne
    public void showPagesToRead() {
        // Find the middle page number
        int middlePage = numberOfPages / 2;
        if (numberOfPages % 2 != 0) {
            middlePage += 1; // For odd number of pages, adjust to get the middle page
        }

        // Use goDownToOne starting from the middle page
        System.out.print("Pages to read: ");
        goDownToOne(middlePage);
    }

    // Private method using goDownToOne from Utilities
    private void goDownToOne(int startNumber) {
        if (startNumber <= 0) {
            System.out.println("Invalid starting page number.");
            return;
        }

        int number = startNumber;

        // Print the starting number
        System.out.print(number);

        // Continue looping until the number becomes 1
        while (number != 1) {
            if (number % 2 == 0) {
                // If the number is even, divide it by 2
                number = number / 2;
            } else {
                // If the number is odd, multiply it by 3 and add 1
                number = number * 3 + 1;
            }
            // Print the new value of the number
            System.out.print(" " + number);
        }
        System.out.println(); // Move to the next line after finishing
    }
}
