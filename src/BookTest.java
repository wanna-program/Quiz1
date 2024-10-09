// Book.java
public class BookTest {

    // Attributes
    private String summary;
    private int numberOfPages;

    // Constructor
    public BookTest(String summary, int numberOfPages) {
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

    // Method to check for repeated words in the summary
    public boolean isRepeatingSummary() {
        if (summary == null || summary.isEmpty()) {
            return false;
        }

        String[] words = summary.toLowerCase().split("\\W+");
        java.util.HashSet<String> wordSet = new java.util.HashSet<>();

        for (String word : words) {
            if (wordSet.contains(word)) {
                // Repeated word found
                return true;
            } else {
                wordSet.add(word);
            }
        }
        // No repeated words
        return false;
    }

    // Method to show the number of pages left to read
    public void showPagesToRead(int pagesRead) {
        if (pagesRead < 0) {
            System.out.println("Pages read cannot be negative.");
        } else if (pagesRead > numberOfPages) {
            System.out.println("You've read more pages than the book contains!");
        } else {
            int pagesLeft = numberOfPages - pagesRead;
            System.out.println("Pages left to read: " + pagesLeft);
        }
    }
}
