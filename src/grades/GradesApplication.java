package grades;
import java.util.*;
public class GradesApplication {
    public static void main(String[] args) {

        boolean confirmation;
        do {
            Scanner input = new Scanner(System.in);
            System.out.print(" Do you want to add a new Student y/n ? ");
            String userInput = input.nextLine();
            confirmation = !userInput.equalsIgnoreCase("y");

            System.out.println(confirmation);

//        boolean confirmationN = userInput.equalsIgnoreCase("n");
//        System.out.println(confirmationN);

        } while (confirmation);

        Student s = new Student("Johnny");

        s.addGrade(50);
        s.addGrade(50);
        s.addGrade(50);
        System.out.println(s.getGradeAverage());

        Student s1 = new Student("Washington");
        s1.addGrade(10);
        s1.addGrade(10);
        s1.addGrade(10);
        System.out.println(s1.getGradeAverage());

        Student s2 = new Student("David");
        s2.addGrade(20);
        s2.addGrade(20);
        s2.addGrade(20);
        System.out.println(s2.getGradeAverage());

        System.out.println("hello");
    };
////        System.out.println(s.getGrades());
////        System.out.println("Enter Name ");
////        String name = input.nextLine();
////        System.out.println("Enter Grade 1 : ");
////        String name = input.nextLine();
////
////        System.out.println("Enter Grade 2 : ");
////        System.out.println("Enter Grade 3 : ");
////        System.out.println("The total is: ");
////        System.out.println("The average is: ");
////        System.out.println("Who you want to call: ");

//        System.out.println("testring");
//        Student student = new Student("maggie");
//
//        System.out.println("testring");
//        Student student = new Student("maggie");
//
//        System.out.println("testring");
//        Student student = new Student("maggie");




    }

