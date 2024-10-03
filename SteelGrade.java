import java.util.Scanner;

public class SteelGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter hardness: ");
        int hardness = sc.nextInt();
        System.out.print("Enter carbon content: ");
        double carbonContent = sc.nextDouble();
        System.out.print("Enter tensile strength: ");
        int tensileStrength = sc.nextInt();

        if (hardness > 50 && carbonContent < 0.7 && tensileStrength > 5600) {
            System.out.println("Grade: 10");
        } else if (hardness > 50 && carbonContent < 0.7) {
            System.out.println("Grade: 9");
        } else if (carbonContent < 0.7 && tensileStrength > 5600) {
            System.out.println("Grade: 8");
        } else if (hardness > 50 && tensileStrength > 5600) {
            System.out.println("Grade: 7");
        } else if (hardness > 50 || carbonContent < 0.7 || tensileStrength > 5600) {
            System.out.println("Grade: 6");
        } else {
            System.out.println("Grade: 5");
        }
        
        sc.close();
    }
}
