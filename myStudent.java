
public class myStudent {
    public static class Student {
        String firstName;
        String lastName;
        double gpa;
        String major;
        int age;
        boolean onProbation;
    }
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.firstName = "Gabriel";
        myStudent.lastName = "Clark";
        myStudent.major = "History";
        myStudent.gpa = 2.5;
        myStudent.age = 26;
        myStudent.onProbation = false;

        Student myStudent2 = new Student();
        myStudent2.firstName = "Joe";
        myStudent2.lastName = "Bridges";
        myStudent2.major = "Mathematics";
        myStudent2.gpa = 1.8;
        myStudent2.age = 22;
        myStudent2.onProbation = true;

    }


    }
