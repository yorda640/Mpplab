import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TheaterBoxOffice boxOffice = new TheaterBoxOffice();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("Welcome to the Theater Box Office!");
            System.out.println("1. Show all empty seats");
            System.out.println("2. Show all reserved seats");
            System.out.println("3. Reserve a seat");
            System.out.println("4. Unreserve a seat");
            System.out.println("5. Empty all seats");
            System.out.println("6. Reserve all seats");
            System.out.println("7. Buy tickets");
            System.out.println("8. Exit");

            // Read user choice
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    boxOffice.showEmptySeats();
                    break;
                case 2:
                    boxOffice.showReservedSeats();
                    break;
                case 3:
                    // Reserve a seat
                    // Ask for row and column
                    System.out.print("Enter row number: ");
                    int row = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    int col = scanner.nextInt();
                    boxOffice.reserveSeat(row, col);
                    break;
                case 4:
                    // Unreserve a seat
                    // Ask for row and column
                    System.out.print("Enter row number: ");
                    int unreserveRow = scanner.nextInt();
                    System.out.print("Enter column number: ");
                    int unreserveCol = scanner.nextInt();
                    boxOffice.unreserveSeat(unreserveRow, unreserveCol);
                    break;
                case 5:
                    boxOffice.emptyAllSeats();
                    break;
                case 6:
                    boxOffice.reserveAllSeats();
                    break;
                case 7:
                    // Buy tickets
                    // Ask for number of tickets and section
                    System.out.print("Enter number of tickets: ");
                    int numTickets = scanner.nextInt();
                    System.out.print("Enter section (FRONT, MIDDLE, or BACK): ");
                    String sectionStr = scanner.next();
                    TheaterBoxOffice.Section section = TheaterBoxOffice.Section.valueOf(sectionStr.toUpperCase());
                    boxOffice.buyTickets(numTickets, section);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
