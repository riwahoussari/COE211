package magic.bag;
import java.util.Random;

public class MagicBag {

    public static void main(String[] args) {
        Bag bag = new Bag();
        System.out.println("Letter 1:        " + bag.GrabLetter(1));
        System.out.println("Letter 2:        " + bag.GrabLetter(2));
        System.out.println("Letter 3:        " + bag.GrabLetter(3));
        System.out.println("Letter 3 again:  " + bag.GrabLetter(3));
        System.out.println("Invalid Index:   " + bag.GrabLetter(10));
    }
    
    public static class Bag {
        private char c1;
        private char c2;
        private char c3;
        
        Bag() {
            Random rand = new Random();
            this.c1 = (char) (rand.nextInt(26) + 'a');
            this.c2 = (char) (rand.nextInt(26) + 'a');
            this.c3 = (char) (rand.nextInt(26) + 'a');
        }
        
        public char GrabLetter(int x) {
            switch (x) {
                case 1:
                    return c1;
                case 2: 
                    return c2;
                case 3:
                    return c3;
                default:
                    return '?';
            }
        }
    }
}



