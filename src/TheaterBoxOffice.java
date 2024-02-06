
import java.util.ArrayList;
import java.util.List;

public class TheaterBoxOffice {
    private static final int NUM_ROWS = 20;
    private static final int NUM_COLS = 28;
    private static final double SALES_TAX_RATE = 0.05;

    // Define sections and corresponding ticket prices
    private enum Section {
        FRONT(18),
        MIDDLE(15),
        BACK(12);

        private final double ticketPrice;

        Section(double ticketPrice) {
            this.ticketPrice = ticketPrice;
        }

        public double getTicketPrice() {
            return ticketPrice;
        }
    }

    private boolean[][] seats = new boolean[NUM_ROWS][NUM_COLS];
    private double totalSales = 0;

    public void showEmptySeats() {
        // Display empty seats
        // Iterate through the seats array and print out the empty ones
    }

    public void showReservedSeats() {
        // Display reserved seats
        // Iterate through the seats array and print out the reserved ones
    }

    public void reserveSeat(int row, int col) {
        // Reserve a seat and calculate total cost
        // Update seats array
        // Calculate cost and add to total sales
    }

    public void unreserveSeat(int row, int col) {
        // Unreserve a seat and recalculate total cost
        // Update seats array
        // Deduct the corresponding amount from total sales
    }

    public void emptyAllSeats() {
        // Empty all seats and reset total sales
        // Reset seats array
        // Reset total sales to 0
    }

    public void reserveAllSeats() {
        // Reserve all seats and calculate total cost
        // Update seats array
        // Calculate cost for all seats and add to total sales
    }

    public List<String> findConsecutiveSeats(int numSeats, Section section) {
        // Find consecutive seats together in a specific section
        // Implement an algorithm to search for consecutive available seats
        return new ArrayList<>();
    }

    public void buyTickets(int numTickets, Section section) {
        // Method to buy tickets for a specific section
        // Find consecutive seats and reserve them
        // Calculate total cost
        // Output total cost
    }

    public void handleMultiplePerformances() {
        // Extend the functionality to handle multiple performances
        // Keep track of reservations and sales for each performance
    }

    // Other methods for displaying menu, handling user input, etc.

    public static void main(String[] args) {
        TheaterBoxOffice boxOffice = new TheaterBoxOffice();
        // Implement main method for running the program
    }
}
