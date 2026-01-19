# Library Book Management System (Lab1JavaReview.java)

## Description

This activity is a **Java console-based application** that simulates a simple **Library Book Management System**. It allows users to register books, borrow and return books, view all registered books, and generate a summary report of book availability.

The program is designed as a **Java fundamentals review**, focusing on control structures, arrays, methods, constants, and user input handling using the `Scanner` class.

## Codebase Overview

This project is implemented entirely in a single file named `Lab1JavaReview.java`.

* **LibraryBookManagementSystem (Main Class)**
  Contains the `main` method and all supporting logic of the program.

### Key Components

* **Constants**

  * `MAX_BOOKS` – defines the maximum number of books the system can store.

* **Data Storage**

  * `bookTitles[]` – stores the titles of registered books.
  * `bookStatuses[]` – stores the status of each book (`Available` or `Borrowed`).
  * `bookCount` – tracks the current number of books in the system.

* **Menu-Driven System**
  The application repeatedly displays a menu that allows the user to:

  * Add new books
  * Borrow a book
  * Return a book
  * Display all books
  * Generate a book status report
  * Exit the program

* **Input Handling**
  Uses the `Scanner` class to read user input from the console and validate choices.

## How to Run the Project

1. Ensure you have **Java JDK 8 or later** installed.
2. Save the file as:

   ```
   Lab1JavaReview.java
   ```
3. Open a terminal or command prompt in the file directory.
4. Compile the program:

   ```bash
   javac Lab1JavaReview.java
   ```
5. Run the program:

   ```bash
   java LibraryBookManagementSystem
   ```
6. Follow the on-screen menu instructions to interact with the system.

## Author

Charles May T. Esquivel
BSCS-2D

## Notes

* The system uses **arrays instead of collections** to reinforce basic Java concepts.
* The maximum number of books is fixed for simplicity.
* This project is intended for educational and review purposes.

