Modeling a School Management System (TeacherStudentAssignment.java)
Description

This activity is a Java console-based application that models a simple School Management System using Object-Oriented Programming (OOP) principles. It demonstrates how real-world school entities such as students, teachers, and courses can be represented through classes and relationships.

The program focuses on applying inheritance (IS-A relationship) and aggregation (HAS-A relationship), along with constructors, method overriding, and the use of object arrays.

Codebase Overview

This project is implemented in a single Java file named TeacherStudentAssignment.java.

TeacherStudentAssignment (Main Class)
Contains the main method where objects are created and program execution begins.

Key Components

Base Class

Person – represents a general person with common attributes such as name, age, and gender.

Derived Classes

Student – extends Person and adds a student ID.

Teacher – extends Person and represents a teacher assigned to multiple courses.

Aggregated Class

Course – represents a course handled by a teacher (HAS-A relationship).

Object Relationships
The system demonstrates:

Inheritance – Student and Teacher inherit from Person

Aggregation – Teacher contains an array of Course objects

Output Display
Each class includes display methods that output formatted information to the console.

How to Run the Project

Ensure you have Java JDK 8 or later installed.

Save the file as:

TeacherStudentAssignment.java


Open a terminal or command prompt in the file directory.

Compile the program:

javac TeacherStudentAssignment.java


Run the program:

java TeacherStudentAssignment


View the displayed student, teacher, and course information in the console.

Author

Charles May T. Esquivel
BSCS-2D

Notes

This project is console-based and does not require user input.

The activity emphasizes OOP concepts rather than data persistence.

Designed for academic and learning purposes to reinforce Java class relationships.
