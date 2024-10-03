import java.util.Scanner;

public class DegreeQualification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks in subject A: ");
        int marksA = sc.nextInt();
        System.out.print("Enter marks in subject B: ");
        int marksB = sc.nextInt();

        if (marksA >= 55 && marksB >= 45) {
            System.out.println("Passed");
        } else if (marksA < 55 && marksA >= 45 && marksB >= 55) {
            System.out.println("Passed");
        } else if (marksA >= 65 && marksB < 45) {
            System.out.println("Allowed to reappear in subject B");
        } else {
            System.out.println("Failed");
        }
        
        sc.close();
    }
}
