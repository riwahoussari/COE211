
package objectifytheworld;

class University {
    String name;
    Classroom room1;
    Classroom room2;
    
    University(String name, Classroom room1, Classroom room2) {
        this.name = name;
        this.room1 = room1;
        this.room2 = room2;
    }
    
    @Override
    public String toString() {
        return "Welcome to " + name + " \n\n" + 
                "House of " + room1 + "\n" +
                "House of " + room2 + "\n";
    }
}

class Classroom {
    int chairsNum;
    Student s1;
    Student s2;
    Student s3;
    Student s4;
    double avgGpa;
    String name;
    
    Classroom(int chairsNum, Student s1, Student s2, Student s3, Student s4, String name) {
        this.chairsNum = chairsNum;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
        this.avgGpa = (s1.gpa + s2.gpa + s3.gpa + s4.gpa) / 4;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return name + " has " + chairsNum + " chairs \n" + 
                "Student 1: " + s1 + "\n" +
                "Student 2: " + s2 + "\n" +
                "Student 3: " + s3 + "\n" +
                "Student 4: " + s4 + "\n" + 
                "Avarage GPA: " + avgGpa + "\n";
    }
}

class Student {
    String name;
    double gpa;
    
    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return name + " - GPA : " + gpa;
    }
}

public class ObjectifyTheWorld {
    public static void main(String[] args) {
        
        // Students for room 1
        Student s1 = new Student("Harry Potter", 3.7);
        Student s2 = new Student("Hermione Granger", 4.0);
        Student s3 = new Student("Ron Weasley", 3.2);
        Student s4 = new Student("Neville Longbottom", 3.0);

        Classroom room1 = new Classroom(20, s1, s2, s3, s4, "Griffindor");

        // Students for room 2
        Student s5 = new Student("Draco Malfoy", 3.3);
        Student s6 = new Student("Luna Lovegood", 3.5);
        Student s7 = new Student("Ginny Weasley", 3.6);
        Student s8 = new Student("Cedric Diggory", 3.8);

        Classroom room2 = new Classroom(25, s5, s6, s7, s8, "Slytherin");

        // University
        University uni = new University("Hogwarts University", room1, room2);

        // Print university
        System.out.println(uni);
    }
}
