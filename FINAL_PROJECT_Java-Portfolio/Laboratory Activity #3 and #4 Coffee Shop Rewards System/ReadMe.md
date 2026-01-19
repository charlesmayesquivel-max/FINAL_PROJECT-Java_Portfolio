Coffee Shop Rewards System (CoffeeShop.java)
Description

This activity is a Java console-based application that simulates a simple Coffee Shop Rewards System for BeanBrew Coffee Shop. The system allows customers to earn reward points from purchases, redeem free drinks once enough points are accumulated, and tracks the total number of registered customers.

The program is designed as a Java fundamentals exercise, focusing on constructors, instance variables, static variables and methods, object-oriented principles, and method invocation.

Codebase Overview

This project is implemented using two Java classes:

CoffeeShop.java

Customer.java

Classes

CoffeeShop (Main Class)
Contains the main method and drives the execution of the program. It creates customer objects, simulates transactions, redeems rewards, and displays system summaries.

Customer (Supporting Class)
Represents a coffee shop customer and contains all reward-related logic.

Key Components
Customer Class

Instance Variables

String name – stores the customer’s name

int points – stores the customer’s reward points

Static Variable

static int totalCustomers – tracks the total number of customers registered in the system

Constructors

Default constructor (no name, 0 points)

Parameterized constructor with name

Parameterized constructor with name and initial points

Instance Methods

addPoints(int points) – adds reward points to a customer

redeemReward() – redeems a free drink if the customer has at least 100 points

displayCustomerInfo() – displays the customer’s name and current points

Static Methods

displayTotalCustomers() – displays the total number of registered customers

getAllowedRewardsRedemption(Customer c) – shows how many free rewards a customer can redeem based on their points

CoffeeShop Class

Creates at least three customers using both default and parameterized constructors

Simulates multiple transactions for a customer using repeated method calls

Redeems rewards for all customers

Displays individual customer information

Displays the total number of customers using a static method

Adds a fourth customer and updates the total customer count

How to Run the Project

Ensure you have Java JDK 8 or later installed.

Save the files as:

CoffeeShop.java
Customer.java


Open a terminal or command prompt in the project directory.

Compile the program:

javac CoffeeShop.java Customer.java


Run the program:

java CoffeeShop


View the console output to observe customer transactions, reward redemptions, and system summaries.

Author

Charlie Fluxx

Notes

The program demonstrates the use of static vs instance members.

Multiple constructors are used to show constructor overloading.

Reward redemption is based on a fixed threshold of 100 points per free drink.

This project is intended for educational and Java fundamentals review purposes.
