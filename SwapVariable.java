import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // With third variable
        System.out.println("Swapping with third variable...");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a + ", b = " + b);

        // Without third variable
        System.out.println("Swapping without third variable...");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
        
        scanner.close();
    }
}
