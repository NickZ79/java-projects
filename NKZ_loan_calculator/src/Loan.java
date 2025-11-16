import java.time.LocalDate;

public record Loan(Person person, int loanAmount, int term, double interestRate) {

    private static final int DEFAULT_TERM_YEARS = 36;
    private static final double DEFAULT_INTEREST = 5.0;
    private static final String NEW_LINE = System.lineSeparator();

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

        return "The loan for: " + person.getFullName() + NEW_LINE
                + "The loan amount is " + loanAmount + NEW_LINE
                + "The term is " + term + " years" + NEW_LINE
                + "The interest rate is " + interestRate + "%" + NEW_LINE
                + "The end date of the loan will be: " + endDate;
    }
}

