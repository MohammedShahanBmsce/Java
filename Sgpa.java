import java.util.Scanner;

class Student {
    String name;
    int[] credits;
    int[] marks;
    int subjects;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter number of subjects: ");
        subjects = sc.nextInt();

        if (subjects <= 0) {
            System.out.println("Invalid number of subjects. Setting to 0.");
            subjects = 0;
            credits = new int[0];
            marks = new int[0];
            return;
        }

        credits = new int[subjects];
        marks = new int[subjects];

        for (int i = 0; i < subjects; i++) {
            System.out.println("\nSubject " + (i + 1) + ":");
            System.out.print("Enter credits: ");
            credits[i] = sc.nextInt();
            System.out.print("Enter marks: ");
            marks[i] = sc.nextInt();
        }
        sc.nextLine(); 
    }
    double calculateSGPA() {
        double totalPoints = 0;
        int totalCredits = 0;

        for (int i = 0; i < subjects; i++) {
            int gradePoint = getGradePoint(marks[i]);
            totalPoints += gradePoint * credits[i];
            totalCredits += credits[i];
        }

        if (totalCredits == 0) {
            return 0.0; 
        }

        return totalPoints / totalCredits;
    }

    int getGradePoint(int marks) {
        if (marks >= 90) return 10;
        else if (marks >= 80) return 9;
        else if (marks >= 70) return 8;
        else if (marks >= 60) return 7;
        else if (marks >= 50) return 6;
        else if (marks >= 40) return 5;
        else return 0;
    }

    void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Subjects: " + subjects);
        System.out.println("\nCredits and Marks:");
        for (int i = 0; i < subjects; i++) {
            System.out.println("Subject " + (i + 1) + ": Credits = " + credits[i] + ", Marks = " + marks[i]);
        }

        double sgpa = calculateSGPA();
        System.out.printf("\nSGPA = %.2f\n", sgpa);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        s.acceptDetails(sc);
        s.displayDetails();
        sc.close();
    }
}
