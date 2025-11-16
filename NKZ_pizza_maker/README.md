# Pizza Maker (Java)

## Overview
This project is a console-based Pizza Maker application built in Java.  
It accepts a list of ingredients, calculates the total cost of the pizza, and determines whether it includes delivery charges. The project also includes a self-contained test runner that validates multiple pizza combinations without relying on external libraries like JUnit.

This assignment demonstrated fundamental object-oriented Java concepts, including inheritance, polymorphism, composition, and basic testing logic.

---

## Features
- Build a pizza from a customizable list of ingredients
- Automatically calculate total pizza cost using:
  - Base pizza cost  
  - Individual ingredient costs  
  - Optional delivery fee
- Ingredient classes that extend a common base class (`Ingredient`)
- A `PizzaMakerTestRunner` that:
  - Runs multiple test scenarios
  - Compares expected vs. actual values
  - Prints pass/fail results to the console

---

## Technologies & Concepts
- **Language:** Java  
- **Paradigm:** Object-Oriented Programming  
- **Key Concepts:**
  - Classes, inheritance, and method overriding  
  - Collections (ArrayList)  
  - Encapsulation  
  - Conditional logic  
  - Custom test runner with console output  

---

## Project Structure
NKZ_pizza_maker/
src/
Ingredient.java
Cheese.java
Ham.java
Pepperoni.java
Mushroom.java
GreenPepper.java
Pizza.java
PizzaMaker.java
PizzaMakerTestRunner.java
README.md

---

### Run the Pizza Maker test suite:
java -cp src PizzaMakerTestRunner
You will see output like:
    Test: Cheese Pizza (No Delivery)
    Test: Cheese Pizza (With Delivery)
    ...
    Tests Passed: 5 / 5

---

## Example Output
```text
Test: Cheese Pizza (With Delivery)
Expected: $8.00
Actual:   $8.00
Result:   PASS
```

---

## What I Learned

How to design and structure an object-oriented Java program

How to model real-world items using classes and inheritance

How to validate behavior using simple test harnesses

How to organize a Java project cleanly for GitHub
