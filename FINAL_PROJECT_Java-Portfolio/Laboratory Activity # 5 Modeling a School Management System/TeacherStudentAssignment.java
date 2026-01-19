// Laboratory Activity: Modeling a School Management System

// Base Class
class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Derived Class (IS-A Person)
class Student extends Person {
    private final String studentId;

    public Student(String name, int age, String gender, String studentId) {
        super(name, age, gender);
        this.studentId = studentId;
    }

    public void displayStudent() {
        System.out.println("\n--- Student Information ---");
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

// Aggregated Class (HAS-A relationship with Teacher)
class Course {
    private final String courseCode;
    private final String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public void displayCourse() {
        System.out.println("    Course Code - " + courseCode);
        System.out.println("    Course Name - " + courseName);
    }
}

// Derived Class (IS-A Person, HAS-A Course)
class Teacher extends Person {
    private final String department;
    private final Course[] courses;

    public Teacher(String name, int age, String gender, String department, Course[] courses) {
        super(name, age, gender);
        this.department = department;
        this.courses = courses;
    }

    public void displayTeacher() {
        System.out.println("\n--- Teacher Information ---");
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Courses Handled:");
        for (Course c : courses) {
            c.displayCourse();
            System.out.println();
        }
    }
}

public class TeacherStudentAssignment {
    public static void main(String[] args) {

        Student student1 = new Student(
            "Charles May T. Esquivel", 19, "Male", "STU3054"
        );
        student1.displayStudent();

        Course c1 = new Course("ENG101", "English Communication Skills");
        Course c2 = new Course("MATH201", "Advanced College Algebra");
        Course c3 = new Course("CS301", "Data Structures and Algorithms");
        Course c4 = new Course("PE401", "Physical Education and Wellness");

        Course[] teacherCourses = { c1, c2, c3, c4 };

        Teacher teacher1 = new Teacher(
            "Mrs. Nerise Dawn Gutierrez",
            42,
            "Female",
            "Computer Science Department",
            teacherCourses
        );
        teacher1.displayTeacher();
    }
}
