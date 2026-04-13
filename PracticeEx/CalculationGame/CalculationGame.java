package calculationgame;

import java.util.Random;
import java.util.Scanner;

public class CalculationGame {
    public static void main(String[] args) {
        int difficulty = 0;
        Random rand = new Random();
        
        while (difficulty != 4) {
            difficulty = getDifficulty();
            int x = rand.nextInt(21);
            int y = rand.nextInt(21);
            int result = 0;
            
            switch (difficulty){
                case 1: 
                    result = x + y;
                    ask((x + " + " + y), result);
                    break;
                case 2: 
                    result = x - y;
                    ask((x + " - " + y), result);
                    break;
                case 3: 
                    result = x * y;
                    ask((x + " * " + y), result);
                    break;
                case 4:
                    System.out.println("Goodbye <3");
                    break;
                default:
                    System.out.println("Invalid Difficulty");
            }     
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
    
    public static int getDifficulty() {
        while (true) {
            
            int x = getInt("\n1-Easy\n" +
                    "2-Medium\n" +
                    "3-Hard\n" +
                    "4-Quit\n" + 
                    "Enter your difficulty: ");

            if (x >= 1 && x <= 4) {
                return x;
            }   
        }
    }
    
    public static void ask(String message, int result) {
        int response = getInt("\nWhat is " + message + " = ");
        
        System.out.println(response == result ? "\nCorrect!" : "\nIncorrect :(");
    }
}
