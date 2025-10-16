import java.util.Scanner;
class Student
{
    String usn, name;
    int[] credits,marks;
void AcceptDetails()
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter USN:");
        usn = sc.next();
        System.out.println("Enter the name of Student:");
        name = sc.next();
        Credits = new int[4];
        marks = new int[4];
        System.out.println("Enter details of Creits And Marks in order for 4 subjects:");
        for (int i=0; i<4; i++)
        {
            System.out.println("Enter Credits For Subject" + (i+i) + ":");
            Credits[i] = sc.next Int();
            System.out.println("Enter marks for" + (i+1) + ":");
            marks[i] = sc.nextInt();
        }
 }
    void Display()
    {
        System.out.println("STUDENT DETAILS");
        System.out.println("USN:" + usn);
        System.out.println("NAME:" + name);
        for (int i=0; i<4; i++)
        {
            System.out.println("Subjects" + (i+1) + "-Credits:" + credits[i] + "MARKS:" + marks[i] );
        }
    }
    double calc()
    {
        int totalcredits = 0;
        double totalGradePoints = 0;
        for(int i=0; i<4; i++)
        {
            totalcredits += credits[i];
            totalGradePoints += gradepoints(marks[i])*credits[i];
        }
        return totalGradePoints/totalcredits;
    }
    int gradepoints(int marks)
    {
        if(marks>=90) return 10;
        else if(marks>=80) return 9;
        else if(marks>=70) return 8;
        else if(marks>=60) return 7;
        else if(marks>=50) return 6;
        else if(marks>=40) return 5;
        else return 0;
    }
}
public class sgpa
{
    public static void main(String[] a) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of students:");
        int numstudent = sc.nextInt();

        Student student[] = new Student [numstudent];
        for(int i =0; i<numstudent; i++)
        {
            Student[i] = newstudent();
            Student[i] = AcceptDetails();
            Student(i).Display();
            System.out.println("\nSGPA:" + Student[i].calc(n);
        }
    }
}