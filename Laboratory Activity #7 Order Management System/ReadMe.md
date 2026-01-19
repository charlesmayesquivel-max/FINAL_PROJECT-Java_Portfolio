# Abstraction and Encapsulation in Java (Order Management System)

## Description

This activity is a **Java console-based application** that implements a simple **Order Management System** for an online store. It is designed to demonstrate the practical use of **abstraction and encapsulation** in Java while maintaining clean code organization and safe data handling.

The program emphasizes the use of **abstract classes, interfaces, enums, packages, and collections** to model order behavior, protect internal data, and manage multiple orders efficiently.

## Codebase Overview

This project is organized using multiple packages to clearly separate responsibilities and improve maintainability.

* **com.store.order**  
  Contains order-related classes and definitions.

* **com.store.payment**  
  Contains payment-related interfaces.

* **com.store.main**  
  Contains the main application entry point.

### Key Components

* **Enum**

  * `OrderStatus` – represents the fixed states of an order:
    * `PENDING`
    * `PAID`
    * `SHIPPED`
    * `CANCELLED`

* **Abstract Class**

  * `Order` – defines the common structure and behavior of all orders.
    * Encapsulates order ID, amount, and status
    * Declares an abstract `processOrder()` method
    * Provides a concrete `getOrderSummary()` method

* **Interface**

  * `Payable` – defines the payment contract through the `pay()` method.

* **Concrete Class**

  * `OnlineOrder` – extends `Order` and implements `Payable`.
    * Implements order processing logic
    * Updates order status upon successful payment
    * Maintains strict encapsulation through private fields and controlled access

* **Collection Management**

  * `ArrayList<Order>` – used to store multiple orders safely.
  * Orders are accessed and modified only through methods, preserving encapsulation.

* **Iterator Usage**

  * `Iterator<Order>` – used to traverse orders
  * Allows safe removal of orders with `CANCELLED` status without index-based access

## How to Run the Project

1. Ensure you have **Java JDK 8 or later** installed.
2. Make sure the package structure matches the following:

com/store/order
com/store/payment
com/store/main

bash
Copy code
3. Open a terminal or command prompt in the project root directory.
4. Compile the project:


javac com/store/order/*.java com/store/payment/*.java com/store/main/*.java
Run the application:

bash
Copy code
java com.store.main.OrderApp
View the displayed order summaries and system behavior in the console.

## Author
Charles May T. Esquivel

BSCS-2D

## Notes
This project demonstrates abstraction using abstract classes and interfaces.

Encapsulation is enforced through private fields, getters, and validation logic.

Enums are used to represent fixed system states safely.

Collections are managed using ArrayList and traversed using Iterator.

This activity is intended for educational and academic purposes.
