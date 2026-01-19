# Smart Home Device Simulation (SmartHomeMain.java)

## Description

This activity demonstrates the application of **Object-Oriented Programming (OOP)** concepts in Java through a simple Smart Home simulation. The program models different household devices (Air Conditioner, LampShade, Television, and Microwave) that share common behaviors such as turning on and off, while also maintaining their own unique properties and status displays.

The project focuses on **abstraction, inheritance, polymorphism, encapsulation, static methods, and constructors**, making it suitable as a Java review and introductory OOP laboratory activity.

## Codebase Overview

This README specifically documents the `SmartHomeMain.java` file. The entire program is contained in this single Java file for simplicity.

* **SmartHomeMain**
  Contains the `main` method. It creates device objects, stores them in a `Device` array, powers all devices on and off, and displays how many devices are currently turned on.

* **Device (Abstract Class)**
  Serves as the parent class for all smart devices.

  * Manages the shared `isOn` state
  * Provides `turnOn()` and `turnOff()` methods
  * Declares the abstract method `showStatus()`
  * Includes static utility methods:

    * `powerAll()` to turn all devices on or off
    * `countPoweredOn()` to count active devices

* **AirConditioner (Child Class)**
  Extends `Device` and adds fan speed and temperature controls.

* **LampShade (Child Class)**
  Extends `Device` and demonstrates constructor overloading and a copy constructor, with brightness and light color settings.

* **Television (Child Class)**
  Extends `Device` and includes channel and volume controls.

* **Microwave (Child Class)**
  Extends `Device` and manages timer and temperature settings.

Polymorphism is demonstrated by storing all device objects in a `Device[]` array and invoking overridden methods at runtime.

## How to Run the Project

1. Ensure you have **Java JDK 8 or later** installed.
2. Save the file as:

   ```
   SmartHomeMain.java
   ```
3. Open a terminal or command prompt in the file directory.
4. Compile the program:

   ```bash
   javac SmartHomeMain.java
   ```
5. Run the program:

   ```bash
   java SmartHomeMain
   ```
6. Observe the console output showing devices being powered on and off along with their respective statuses.

## Author

Charlie Fluxx

## Notes

* This project is console-based and intended for learning purposes.
* All classes are placed in one file to simplify submission and review.
* The design can be easily extended by adding new device classes that inherit from `Device`.
