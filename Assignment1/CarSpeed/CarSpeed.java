
package carspeed;
import java.util.Scanner;

class Car {
    String name;
    double speed;

    double calculateTime(double distance) {
        return distance / speed;
    }
    
    void getInfo() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name of car: ");
        this.name = scanner.nextLine();

        System.out.print("Enter speed of " + name + ": ");
        this.speed = scanner.nextDouble();
        scanner.nextLine(); // consume newline 
           
        System.out.println();
    }
}

public class CarSpeed {
    public static void main(String[] args) {
        // create cars
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        
        // input info
        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        
        // input track length
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter track length: ");
        double distance = scanner.nextDouble();
        System.out.println();

        // Output results
        System.out.printf("%s will finish the race in %.2f seconds%n", car1.name, car1.calculateTime(distance));
        System.out.printf("%s will finish the race in %.2f seconds%n", car2.name, car2.calculateTime(distance));
        System.out.printf("%s will finish the race in %.2f seconds%n", car3.name, car3.calculateTime(distance));
        
        scanner.close();
    }
}

