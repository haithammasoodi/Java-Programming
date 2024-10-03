import java.util.Scanner;

public class LibraryFineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of days late: ");
        int daysLate = scanner.nextInt();
        
        if (daysLate < 0) {
            System.out.println("Invalid input. Days cannot be negative.");
        } else if (daysLate > 30) {
            System.out.println("Your membership has been cancelled.");
        } else {
            int fine = calculateFine(daysLate);
            System.out.println("The fine for returning the book late is: " + fine + " rupees.");
        }
        
        scanner.close();
    }
    
    private static int calculateFine(int daysLate) {
        if (daysLate <= 5) {
            return daysLate * 0.5; // Fine in paise, convert to rupees by dividing by 100
        } else if (daysLate <= 10) {
            return (5 * 0.5) + ((daysLate - 5) * 1); // 50 paise for first 5 days + 1 rupee for next days
        } else {
            return (5 * 0.5) + (5 * 1) + ((daysLate - 10) * 5); // 50 paise for first 5 days + 1 rupee for next 5 days + 5 rupees for additional days
        }
    }
}
