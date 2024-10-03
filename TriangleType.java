import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();
        System.out.print("Enter second side: ");
        int b = sc.nextInt();
        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a == b && b == c) {
            System.out.println("Equilateral Triangle");
        } else if (a == b || b == c || a == c) {
            System.out.println("Isosceles Triangle");
        } else if (a * a + b * b == c * c || b * b + c * c == a * a || c * c + a * a == b * b) {
            System.out.println("Right-angled Triangle");
        } else {
            System.out.println("Scalene Triangle");
        }
        
        sc.close();
    }
}
