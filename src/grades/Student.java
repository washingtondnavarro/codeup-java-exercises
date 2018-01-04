package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

//    public Student(String name, ArrayList<Integer> grades) {
//        this.name = name;
//        this.grades = new ArrayList<>();
//    }
//        public Student(String name) {
//        this.name = name;
//        this.grades = new ArrayList<>();
//    }

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }


    public String getName() {
        return name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }


    //    public double getGradeAverage()
//    {
//
//        int adding1 = grades.get(0);
//        int adding2 = grades.get(1);
//        int adding3 = grades.get(2);
//        int total = adding1 + adding2 + adding3;
//        int average = total / 3;
//        return average;
//    }
//}
    public double getGradeAverage() {
        int numberOfGrades = grades.size();
        double sumOfAllGrades = 0;
        double average;
//
        for (int grade : grades) {
            sumOfAllGrades += grade;
        }
//
        average = sumOfAllGrades / numberOfGrades;
        return average;

    }
}



