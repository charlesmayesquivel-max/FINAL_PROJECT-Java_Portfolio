# Coffee Shop Rewards System

## Description

This lab exercise implements a **Coffee Shop Rewards System** for BeanBrew Coffee Shop using **Java Object-Oriented Programming** principles. The program simulates how customers earn reward points from purchases, redeem free drinks upon reaching a required point threshold, and how the system tracks the total number of registered customers.

The activity emphasizes the correct use of **constructors**, the **`this` keyword**, **static variables and methods**, and applies these concepts in a practical, real-world business scenario.

## Learning Objectives

* Differentiate between **default** and **parameterized constructors**
* Correctly use the **`this` keyword** for instance variables and methods
* Implement and utilize **static variables** and **static methods**
* Apply **object-oriented principles** in a realistic application context

## Codebase Overview

The project is composed of two main classes:

### Customer Class

Represents a coffee shop customer enrolled in the rewards program.

**Instance Variables**

* `String name` – stores the customer’s name
* `int points` – stores accumulated reward points

**Static Variable**

* `static int totalCustomers` – tracks the total number of registered customers

**Constructors**

* Default constructor for new or unnamed customers
* Parameterized constructor for initializing name
* Parameterized constructor for initializing name and starting points

**Instance Methods**

* `addPoints(int points)` – adds reward points from purchases
* `redeemReward()` – redeems a free drink for every 100 points
* `displayCustomerInfo()` – displays the customer’s details

**Static Methods**

* `displayTotalCustomers()` – displays the total number of customers
* `getAllowedRewardsRedemption(Customer customer)` – calculates how many free rewards a customer can redeem based on their points

### CoffeeShop Class (Main Class)

Handles program execution and simulates customer transactions.

Key responsibilities:

* Creates customer objects using both default and parameterized constructors
* Simulates multiple transactions by calling `addPoints()` multiple times
* Redeems rewards for all customers
* Displays customer information and total customers using static methods
* Registers new customers dynamically

## Program Flow Summary

* Three customers are initially created:

  * Joseph (200 points)
  * Peter (new customer, gains points through multiple transactions)
  * An unnamed customer
* Reward redemption is attempted for all customers
* Customer details and total customer count are displayed
* A fourth customer, Diane, is added and earns points
* The total number of customers is updated and displayed

## How to Run the Project

1. Ensure **Java JDK 8 or later** is installed.
2. Save the files as:

Customer.java
CoffeeShop.java

3. Open a terminal or command prompt in the project directory.
4. Compile the program:

javac Customer.java CoffeeShop.java


Run the application:

java CoffeeShop


Follow the console output to observe reward accumulation and redemption.


## Author

Charles May T. Esquivel

BSCS-2D

## Notes

Reward redemption is based on a 100-point threshold per free drink.

Static members ensure accurate tracking of customers across all instances.

The design can be extended to include purchase history, point expiration, or GUI support.
