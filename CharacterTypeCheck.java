import java.util.Scanner;

public class CharacterTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special symbol");
        }
        sc.close();
    }
}
