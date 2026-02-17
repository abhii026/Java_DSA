import java.util.Scanner;

class Subject {
    private String name;
    private double marks;
    private int credits;
    private double gradePoint;

    public Subject(String name, double marks, int credits) {
        this.name = name;
        this.marks = marks;
        this.credits = credits;
        this.gradePoint = calculateGradePoint();
    }

    private double calculateGradePoint() {
        if(marks >= 90) return 10;
        else if(marks >= 80) return 9;
        else if(marks >= 70) return 8;
        else if(marks >= 60) return 7;
        else if(marks >= 50) return 6;
        else if(marks >= 40) return 5;
        else return 0;
    }

    public double getWeightedGradePoint() {
        return gradePoint * credits;
    }

    public int getCredits() {
        return credits;
    }
}

class Semester {
    private Subject[] subjects;
    private int totalSubjects;

    public Semester(int totalSubjects) {
        this.totalSubjects = totalSubjects;
        subjects = new Subject[totalSubjects];
    }

    public void addSubjects(Scanner in) {
        for(int i = 0; i < totalSubjects; i++) {
            System.out.println("\nEnter Subject " + (i+1) + " name:");
            String name = in.next();

            System.out.println("Enter marks:");
            double marks = in.nextDouble();

            System.out.println("Enter credits:");
            int credits = in.nextInt();

            subjects[i] = new Subject(name, marks, credits);
        }
    }

    public double calculateCGPA() {
        double totalGradePoints = 0;
        int totalCredits = 0;

        for(int i = 0; i < totalSubjects; i++) {
            totalGradePoints += subjects[i].getWeightedGradePoint();
            totalCredits += subjects[i].getCredits();
        }

        return totalGradePoints / totalCredits;
    }
}

public class CGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Semester Number: ");
        int semesterNumber = in.nextInt();

        System.out.print("Enter total subjects: ");
        int totalSubjects = in.nextInt();

        Semester semester = new Semester(totalSubjects);
        semester.addSubjects(in);

        double cgpa = semester.calculateCGPA();

        System.out.println("\nSemester " + semesterNumber + " CGPA: " + cgpa);

        in.close();
    }
}
