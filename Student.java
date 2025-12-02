public class Student {

    long id;
    String name;
    int age;
    String email;
    String mobileNumber;

    // ✅ Subject marks
    int dtiMarks;   // Design Thinking & Innovation
    int javaMarks;  
    int ddcaMarks;  // Digital Design & Computer Architecture

    public Student(
        long id,
        String name,
        int age,
        String email,
        String mobileNumber,
        int dtiMarks,
        int javaMarks,
        int ddcaMarks
    ) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.dtiMarks = dtiMarks;
        this.javaMarks = javaMarks;
        this.ddcaMarks = ddcaMarks;
    }

    public int getTotal() {
        return dtiMarks + javaMarks + ddcaMarks;
    }

    public double getAverage() {
        return getTotal() / 3.0;
    }

    // ✅ Method to return Grade
    public String getGrade() {
        double avg = getAverage();

        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B";
        else if (avg >= 60) return "C";
        else if (avg >= 50) return "D";
        else return "F";
    }

    public String toString() {
        return "\nStudent Details:\n"
            + "ID: " + id + "\n"
            + "Name: " + name + "\n"
            + "Age: " + age + "\n"
            + "Email: " + email + "\n"
            + "Mobile Number: " + mobileNumber + "\n"
            + "Design Thinking & Innovation Marks: " + dtiMarks + "\n"
            + "Java Marks: " + javaMarks + "\n"
            + "Digital Design & Computer Architecture Marks: " + ddcaMarks + "\n"
            + "Total Marks: " + getTotal() + "\n"
            + "Average Marks: " + getAverage() + "\n"
            + "Grade: " + getGrade();
    }
}




