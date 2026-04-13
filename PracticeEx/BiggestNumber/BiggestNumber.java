package biggestnumber;

import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {
        int iteration = 0;
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        int maxIteration = 0;
        
        while (iteration != -1) {        
            System.out.print("\nEnter a number: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                iteration = -1;
                System.out.println("\nThe biggest number entered is " + max + " at iteration " + (maxIteration + 1));
                
            } else {
                int x = Integer.parseInt(input);
                
                if (iteration == 0) {
                    max = x;
                } else if (x > max) {
                    max = x;
                    maxIteration = iteration;
                }
                
                iteration++;
            }
            
           
        }
    }
    
}
