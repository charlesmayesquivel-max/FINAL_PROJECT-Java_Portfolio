Book List Management System (MyBookList.java)
Description

This activity is a Java console-based application that demonstrates the use of Object-Oriented Programming (OOP) principles through a simple Book List Management System. The program models a Book entity with attributes such as title, author, year published, and current page, and performs operations such as displaying book details, simulating reading progress, and filtering books based on publication year.

The project is designed as an introductory Java OOP laboratory activity, focusing on encapsulation, constructors, immutability using final fields, arrays of objects, getters and setters, and basic conditional logic.

Codebase Overview

This project is implemented using two Java classes:

MyBookList.java

Book.java

Classes

MyBookList (Main Class)
Contains the main method and serves as the driver program. It creates multiple Book objects, stores them in an array, invokes instance methods, and applies conditional logic such as filtering books published after a specific year.

Book (Supporting Class)
Represents a book entity and encapsulates all book-related data and behaviors.

Key Components
Book Class

Private Attributes

final String title – stores the book title (immutable)

String author – stores the author’s name

final int yearPublished – stores the publication year (immutable)

int currentPage – tracks the current reading progress

Constructor

Initializes book objects with required details

Getter Methods

Provide controlled access to book information

Setter Methods

Allow modification of mutable fields such as author and current page

Instance Methods

displayDetails() – displays complete book information

Reading-related methods that update the current page to simulate progress

Encapsulation is enforced by keeping all fields private and exposing access through methods only.

MyBookList Class

Instantiates multiple Book objects using constructors

Stores book objects in an array

Iterates through the array to:

Display book details

Simulate reading progress

Filter and display books published after 2010

Demonstrates object interaction and basic conditional logic

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


Observe the console output displaying:

Book details

Reading progress updates

A list of books published after 2010

Author

Charles May T. Esquivel
BSCS-2D

Notes

This is a console-based Java application intended for learning and practice.

The project emphasizes clean class design and proper application of OOP fundamentals.

The program can be easily extended by:

Adding methods such as markAsFinished()

Introducing book categories or genres

Implementing user input instead of hardcoded objects