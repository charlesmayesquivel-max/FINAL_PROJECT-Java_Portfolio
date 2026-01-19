Book List Management System (MyBookList.java)
Description

This activity demonstrates the use of Object-Oriented Programming (OOP) principles in Java through a simple Book List Management System. The program models a Book entity with attributes such as title, author, year published, and current page, and performs various operations such as displaying book details, simulating reading progress, and filtering books based on publication year.

The project focuses on encapsulation, constructors, immutability with final fields, arrays of objects, getters/setters, and basic conditional logic, making it suitable as an introductory Java OOP laboratory activity.

Codebase Overview

This README documents the following Java files:

MyBookList.java
Contains the main method. This class serves as the driver program where multiple Book objects are created and tested. It demonstrates:

Instantiating objects using constructors

Calling instance methods

Storing objects in an array

Iterating through objects to apply conditions (e.g., filtering books published after 2010)

Book.java
Represents the Book class and encapsulates book-related data and behavior.

Key features:

Private attributes:

title (final)

author

yearPublished (final)

currentPage

Constructor to initialize book objects

Getter methods for accessing book details

Setter methods for modifying mutable fields

displayDetails() method to print book information

Reading-related behavior that updates the current page

Encapsulation is enforced by keeping fields private and exposing controlled access through methods.

How to Run the Project

Ensure you have Java JDK 8 or later installed.

Place both files in the same directory:

Book.java
MyBookList.java


Open a terminal or command prompt in that directory.

Compile the program:

javac Book.java MyBookList.java


Run the program:

java MyBookList


Observe the console output showing:

Book details

Reading progress

A list of books published after 2010

Author

Charles May T. Esquivel
BSCS-2D

Notes

This is a console-based Java application intended for learning and practice.

The project emphasizes clean class design and proper use of OOP fundamentals.

The program can be easily extended by:

Adding methods such as markAsFinished()

Introducing book categories or genres

Implementing user input instead of hardcoded objects
