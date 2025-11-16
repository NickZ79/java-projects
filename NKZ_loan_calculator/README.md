
---

# 💰 **README for `NKZ_loan_calculator`**

```markdown
# Loan Calculator (Java)

## Overview
This project is a Java console application that builds a formatted loan summary based on borrower information, loan amount, term, and interest rate. It also includes a custom test runner that validates several loan scenarios without requiring JUnit or Maven, making it easy to run in any development environment.

The assignment demonstrates Java fundamentals including methods, string formatting, basic validation, and class responsibility separation.

---

## Features
- Generate a formatted loan summary including:
  - Borrower name
  - Loan amount
  - Term (in years)
  - Interest rate
  - Calculated end date using a helper class
- Flexible input handling (supports missing optional parameters)
- Independent classes for:
  - Main execution (`LoanCreator`)
  - Date calculations (`LoanDateCalculator`)
- Custom test runner that compares expected vs. actual output

---

## Technologies & Concepts
- **Language:** Java  
- **Key Concepts:**
  - Methods and return values  
  - Conditional logic for default values  
  - String building and formatting  
  - Custom test harness  
  - Basic procedural design  

---

## Project Structure
NKZ_loan_calculator/
src/
LoanCreator.java
LoanDateCalculator.java
LoanCreatorTestRunner.java
README.md

---

## How to Run

### Compile:

javac src/*.java

### Run the custom test suite:

java -cp src LoanCreatorTestRunner

You will see output like:

Running LoanCreator Tests...
Test: Loan with All Parameters
Result: PASS
Test: Loan with Amount Only
Result: PASS
...
Tests Passed: 4 / 4

---

## Example Output
```text
The loan for: Sally Freedom
The loan amount is 40000
The term is 24 years
The interest rate is 5.0%
The end date of the loan will be: 2049
```

---

## What I Learned

How to break a problem into multiple responsibilities

How to calculate and format dynamic output

How to test logic without external libraries

How to organize projects for GitHub clarity