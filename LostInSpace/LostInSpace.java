
package lostinspace;
import java.util.Random;

class Point {
    double x;
    double y;
    
    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

public class LostInSpace {
    public static void main(String[] args) {
        // generate points
        Point a = new Point(randCoord(), randCoord());
        Point b = new Point(randCoord(), randCoord());
        Point c = new Point(randCoord(), randCoord());
        
        // output distances
        System.out.printf("AB is %.1f \n", getDistance(a, b));
        System.out.printf("AC is %.1f \n", getDistance(a, c));
        System.out.printf("BC is %.1f \n", getDistance(b, c));
    }
    
    public static double randCoord() {
        Random rand = new Random();
        return rand.nextDouble() * 200 - 100;
    }
    
    public static double getDistance(Point a, Point b) {
        return Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    }
}
