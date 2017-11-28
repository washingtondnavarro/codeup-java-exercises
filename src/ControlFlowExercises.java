import java.util.*;

public class ControlFlowExercises {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        WHiLE
//        While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15


//        int i = 5;

//        while ( i <= 15){
//            System.out.println("Your number is " +i);
//            i++;
//        }
//Do While

//            Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//        int i = 100;
//do {
//    System.out.println("Your number is " + i);
//    i -= 2;
//
//        }while (i >= 0);
//        Alter your loop to count backwards by 5's from 100 to -10.

//                int i = 100;
//        do {
//            System.out.println("Your number is " + i);
//            i -= 5;
//            }while (i >= -10);

//            for(int i = 5; i <= 15; i++) {
//                System.out.println(i);
//            }

//
//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536


//            long i = 2;
//            do {
//            System.out.println("Your number is " + i);
//            i *= i;
//            }while (i <= 1000000);

//-----------------refactored by FOR

        //        refactor the previous two exercises to use a for loop instead

        //        for(long i = 2; i <= 1000000; i *= i ) {
        //            System.out.println("i is " + i);
        //        }

//------------SECOND SECTION FIZZBUZZ
//
//        int f = 3;
//        int b = 5;

//        for(int i = 0; i <= 100; i++) {
//
//            if((i % 3 == 0) && (i % 5 == 0)){
//                System.out.println("FrizzBuzz");
//            }else if(i % 3 == 0) {
//                System.out.println("Frizz");
//            }else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            }else {
//                System.out.println(i);
//            }
//        }

//        int numberouno;
//
//        System.out.println("Enter an integer");
//        int numberodos;
//        numberodos = sc.nextInt();
//        System.out.println("Your number is " + numberodos);
//
//
//        String affirmative = new String("yes");
//        String negative = new String("no");
//        System.out.println("Do you want to see the Squared and the Cubed of your number? ");
//        String yesornot = sc.next();
//
//
//        if (yesornot.equals(affirmative)) {
//            System.out.println(" -------- -------- -------- ");
//            System.out.println("| Number | Squared | Cubed  |");
//            System.out.println("|--------|--------|--------|");
//
//                    for (numberouno = 0; numberouno <= numberodos; numberouno++) {
//                        System.out.println("|" + numberouno + "       |" + numberouno * numberouno + "       |" + numberouno * numberouno * numberouno + "       |");
//                    }
//        } else if (negative.equals(yesornot)){
//            System.out.println("Have a Nice Day");
//            } else  {
//            System.out.println("Enter a valid answer");
//        }
//        }


        System.out.println("Enter an grade");
        int gradouno;
        gradouno = sc.nextInt();

        if ((100 >= gradouno) && (gradouno >= 88)) {
            System.out.println( " your grade is A");
        } else if ((87>= gradouno) && (gradouno >= 80)) {
            System.out.println( " your grade is B");
        } else if ((79 >= gradouno) && (gradouno >= 67)) {
            System.out.println(" your grade is C");
        } else if ((66 >= gradouno) && (gradouno >= 60)) {
            System.out.println(" your grade is D");
        } else if ((59 >= gradouno) && (gradouno >= 0)) {
            System.out.println( " your grade is F");
        } else {
            System.out.println("Your input is not valid");
        }

    }}



