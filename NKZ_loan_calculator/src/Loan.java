package edu.hfcc;

import java.time.LocalDate;

public record Loan(Person person, int loanAmount, int term, double interestRate) {

    private static final int DEFAULT_TERM_YEARS = 36;
    private static final double DEFAULT_INTEREST = 5.0;

    public Loan(Person person, int loanAmount) {
        this(person, loanAmount, DEFAULT_TERM_YEARS, DEFAULT_INTEREST);
    }

    public Loan(Person person, int loanAmount, int term) {
        this(person, loanAmount, term, DEFAULT_INTEREST);
    }

    public Loan(Person person, int loanAmount, double interestRate) {
        this(person, loanAmount, DEFAULT_TERM_YEARS, interestRate);
    }

    public String buildOutput() {
        LocalDate endDate = LoanDateCalculator.calculate(term);

        return "The loan for: " + person.getFullName() + "\n"
                + "The loan amount is " + loanAmount + "\n"
                + "The term is " + term + " years\n"
                + "The interest rate is " + interestRate + "%\n"
                + "The end date of the loan will be: " + endDate;
    }
}
