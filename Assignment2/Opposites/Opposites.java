package opposites;
import java.util.Scanner;


public class Opposites {

    public static void main(String[] args) {
        
        int x = getInt("Enter the first number: ");
        int y = getInt("Enter the second number: ");
        
        if (x > 0 && y > 0) {
            System.out.println("Both are positive");
        }
        else if (x < 0 && y < 0 ) {
            System.out.println("Both are negative");
        }
        else {
            System.out.println("They are opposites");
        }
    }
    
    public static int getInt(String message) {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print(message);
        x = scanner.nextInt();
        System.out.println();
        
        return x;  
    }
}
