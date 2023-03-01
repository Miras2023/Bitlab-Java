import java.util.ArrayList;

public class StudentAwards {
    public Student theMostGPA(ArrayList<Student> students) {
        BestStudent best = studentsList -> {
            Student maxGpaStudent = studentsList.get(0);

            for (Student max : studentsList) {
                if (maxGpaStudent.getGpa() < max.getGpa()) {
                    maxGpaStudent = max;
                }
            }
            return maxGpaStudent;
        };
        return best.theBest(students);
    }

    Student theMostAge(ArrayList<Student> students) {
        BestStudent best = studentsList -> {
            Student maxAge = studentsList.get(0);
            for (Student age : studentsList) {
                if (maxAge.getAge() < age.getGpa()) {
                    maxAge = age;
                }
            }
            return maxAge;
        };
        return best.theBest(students);

    }


    Student theLongFullName(ArrayList<Student> students) {
        BestStudent best = studentsList -> {
            Student maxName = studentsList.get(0);
            for (Student lengthName : studentsList) {
                if (maxName.getFullName().length() > lengthName.getFullName().length()) {
                    maxName = lengthName;
                }
            }
            return maxName;
        };
        return best.theBest(students);
    }

    Student theHighest(ArrayList<Student> students) {
        BestStudent best = studentsList -> {
            Student maxHigh = studentsList.get(0);
            for (Student bestHigh : studentsList) {
                if (maxHigh.getHeight() < bestHigh.getHeight()) {
                    maxHigh = bestHigh;
                }
            }
            return maxHigh;
        };
        return best.theBest(students);

    }
}
