import java.util.Scanner;

public class WorkerEfficiency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the time taken by the worker (in hours): ");
        int time = sc.nextInt();
        
        if (time >= 2 && time <= 3) {
            System.out.println("Highly efficient");
        } else if (time > 3 && time <= 4) {
            System.out.println("Improve speed");
        } else if (time > 4 && time <= 5) {
            System.out.println("Training required to improve speed");
        } else if (time > 5) {
            System.out.println("Leave the company");
        }
        
        sc.close();
    }
}
