package chapter12;

import java.util.Map;

public class StackGradeBook {

    public static void main(String[] args) {

        Map<String, Integer> gradeBook = StackTestResults.getOriginalGrades();
        Map<String, Integer> secondScore = StackTestResults.getMakeUpGrades();

        for (var student : secondScore.entrySet()) {
            Integer firstGrade = gradeBook.get(student.getKey());
            Integer secondGrade = secondScore.get(student.getKey());

            if (secondGrade > firstGrade) {
                gradeBook.put(student.getKey(), secondGrade);
            }
        }

        gradeBook.forEach(
                (k, v) -> System.out.println("Student: " + k + ", Grade: " + v)
        );
    }
}
