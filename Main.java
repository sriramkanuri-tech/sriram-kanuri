import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        long id = sc.nextLong();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        System.out.print("Enter Mobile Number: ");
        String mobileNumber = sc.nextLine();

        // ✅ Marks input
        System.out.print("Enter Design Thinking & Innovation Marks: ");
        int dtiMarks = sc.nextInt();

        System.out.print("Enter Java Marks: ");
        int javaMarks = sc.nextInt();

        System.out.print("Enter Digital Design & Computer Architecture Marks: ");
        int ddcaMarks = sc.nextInt();

        Student s1 = new Student(
            id, name, age, email, mobileNumber,
            dtiMarks, javaMarks, ddcaMarks
        );

        System.out.println("\n===== Student Details =====");
        System.out.println(s1);
    }
}


