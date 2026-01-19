# Modeling a School Management System (TeacherStudentAssignment.java)

## Description

This activity is a **Java console-based application** that models a simple **School Management System** using **Object-Oriented Programming (OOP) principles**. It demonstrates how real-world school entities such as persons, students, teachers, and courses can be represented using classes and object relationships.

The program is designed to reinforce **core OOP concepts**, including inheritance, aggregation, constructors, method reuse through the `super` keyword, and structured data representation using object arrays.

## Codebase Overview

This project is implemented entirely in a single file named `TeacherStudentAssignment.java`.

* **TeacherStudentAssignment (Main Class)**  
  Contains the `main` method and controls the overall execution of the program.

### Key Components

* **Base Class**

  * `Person` – represents a general person with common attributes such as name, age, and gender.

* **Derived Classes**

  * `Student` – extends `Person` and adds a student ID.
  * `Teacher` – extends `Person` and represents a teacher assigned to multiple courses.

* **Aggregated Class**

  * `Course` – represents a course handled by a teacher, demonstrating a HAS-A relationship.

* **Object Relationships**  
  The application demonstrates the following relationships:

  * **Inheritance (IS-A)** – `Student` and `Teacher` inherit from `Person`
  * **Aggregation (HAS-A)** – `Teacher` maintains an array of `Course` objects

* **Output Display**  
  Each class contains display methods that output formatted information to the console.

## How to Run the Project

1. Ensure you have **Java JDK 8 or later** installed.
2. Save the file as:

TeacherStudentAssignment.java

markdown
Copy code
3. Open a terminal or command prompt in the file directory.
4. Compile the program:


javac TeacherStudentAssignment.java
Run the program:


Copy code
java TeacherStudentAssignment
View the displayed student, teacher, and course information in the console.

## Author
Charles May T. Esquivel

BSCS-2D

## Notes
This project is console-based and does not require user input.

The system focuses on demonstrating object relationships rather than user interaction.

This activity is intended for educational and learning purposes.
