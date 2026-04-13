package switchcalculator;

import java.util.Scanner;

public class SwitchCalculator {

    public static void main(String[] args) {
        int x = getInt("Enter the first number: ");
        int y = getInt("Enter the second number: ");
        int op = getOperator();
        
        switch (op) {
            case 1: 
                System.out.printf("%d + %d = %d\n", x, y, x + y);
                break;
            
            case 2:
                System.out.printf("%d - %d = %d\n", x, y, x - y);
                break;
              
            case 3: 
                System.out.printf("%d * %d = %d\n", x, y, x * y);
                break;
            
            case 4:
                System.out.printf("%d / %d = %.4f\n", x, y, (float) x / y);
                break;
            
            case 5: 
                System.out.printf("%d %% %d = %d\n", x, y, x % y);
                break;
            
            default:
                System.out.println("Invalid Operator");
                break;
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
    
    public static int getOperator() {
        int x;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n1- Addition\n" +
                        "2- Subtraction\n" +
                        "3- Multiplication\n" +
                        "4- Division\n" +
                        "5- Remainder\n\n" + 
                        "Choose an arithmetic operation: ");
        
        x = scanner.nextInt();
        System.out.println();
        
        return x;  
    }
}
