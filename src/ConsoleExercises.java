import java.util.*;

public class ConsoleExercises {

    public static void main(String[] args) {
//        Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number : ");
        int userInput;
            userInput = sc.nextInt();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter your greetings");
        String gr = s1.next();
        System.out.println("Enter your first name");
        String w = s1.next();
                System.out.println("Enter your last name");
                String n = s1.next();
                System.out.println("Your name is " + gr + " " + w + " " + n);

        String  firstWord, secondWord, thirdWord;

        firstWord = sc.next();
        secondWord = sc.next();
        thirdWord = sc.next();

//        System.out.print(firstWord);
//        System.out.print(seconWord);
//        System.out.print(firstWord);
////        What happens if you input something that is not an integer?
//        Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//                What happens if you enter less than 3 words?
//                What happens if you enter more than 3 words?
//                Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
//        do you capture all of the words?
//        Rewrite the above example using the .nextLine method.

        System.out.println("Enter your favorite world");
        String sent = s1.nextLine();


//        Calculate the perimeter and area of Codeup's classrooms
//
//        Prompt the user to enter values of length and width of the classroom.
//                Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//                Assume that the rooms are perfect rectangles.
//        Assume that the user will enter valid numeric data for length and width.
//                Display the area and perimeter of that classroom.
//
//                area = length x width
//        perimter = 2 x length + 2 x width
//        Bonus
//
//        Accept decimal entries
//        Calculate the volume of the rooms

//        System.out.println();
    }

}
