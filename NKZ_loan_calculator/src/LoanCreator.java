package edu.hfcc;

import java.util.Scanner;

public class LoanCreator {

    public String execute(String firstName, String lastName,
                          int loanAmount, Integer term, Double interestRate) {

        Person person = new Person(firstName, lastName);
        Loan loan;

        if (term == null && interestRate == null) {
            // Person + loan amount only (defaults for term and interest)
            loan = new Loan(person, loanAmount);
        } else if (term == null) {
            // Person + amount + interest, default term
            loan = new Loan(person, loanAmount, interestRate);
        } else if (interestRate == null) {
            // Person + amount + term, default interest
            loan = new Loan(person, loanAmount, term);
        } else {
            // Person + amount + term + interest
            loan = new Loan(person, loanAmount, term, interestRate);
        }

        return loan.buildOutput();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter loan amount: ");
        int loanAmount = input.nextInt();

        System.out.print("Enter term in years (or 0 for default): ");
        int termInput = input.nextInt();
        Integer term = (termInput == 0) ? null : termInput;

        System.out.print("Enter interest rate (or 0 for default): ");
        double interestInput = input.nextDouble();
        Double interestRate = (interestInput == 0) ? null : interestInput;

        LoanCreator creator = new LoanCreator();
        String result = creator.execute(firstName, lastName, loanAmount, term, interestRate);

        System.out.println();
        System.out.println(result);
    }
}
