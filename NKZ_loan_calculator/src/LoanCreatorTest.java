package edu.hfcc;

// package edu.hfcc;  // <-- remove or keep only if your other classes still use this package

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanCreatorTest {

    private static final String NEW_LINE = "\n";

    public static void main(String[] args) {
        LoanCreator loanCreator = new LoanCreator();

        int testsRun = 0;
        int testsPassed = 0;

        // 1) verifyLoanWithAllParametersPassedIn
        {
            String expected = "The loan for: Fred Wasup" + NEW_LINE +
                    "The loan amount is 20000" + NEW_LINE +
                    "The term is 60 years" + NEW_LINE +
                    "The interest rate is 6.5%" + NEW_LINE +
                    "The end date of the loan will be: " + LoanDateCalculator.calculate(60);

            String actual = loanCreator.execute("Fred", "Wasup", 20000, 60, 6.5);

            if (expected.equals(actual)) {
                testsPassed++;
                System.out.println("✅ verifyLoanWithAllParametersPassedIn passed");
            } else {
                System.out.println("❌ verifyLoanWithAllParametersPassedIn FAILED");
                System.out.println("Expected:\n" + expected);
                System.out.println("Actual:\n" + actual);
            }
            testsRun++;
        }

        // 2) verifyLoanWithLoanAmountPassedIn
        {
            String expected = "The loan for: John Doe" + NEW_LINE +
                    "The loan amount is 40000" + NEW_LINE +
                    "The term is 36 years" + NEW_LINE +
                    "The interest rate is 5.0%" + NEW_LINE +
                    "The end date of the loan will be: " + LoanDateCalculator.calculate(36);

            String actual = loanCreator.execute("John", "Doe", 40000, 36, 5.0);

            if (expected.equals(actual)) {
                testsPassed++;
                System.out.println("✅ verifyLoanWithLoanAmountPassedIn passed");
            } else {
                System.out.println("❌ verifyLoanWithLoanAmountPassedIn FAILED");
                System.out.println("Expected:\n" + expected);
                System.out.println("Actual:\n" + actual);
            }
            testsRun++;
        }

        // 3) verifyLoanWithLoanAmountAndTermPassedIn
        {
            String expected = "The loan for: Sally Freedom" + NEW_LINE +
                    "The loan amount is 40000" + NEW_LINE +
                    "The term is 24 years" + NEW_LINE +
                    "The interest rate is 5.0%" + NEW_LINE +
                    "The end date of the loan will be: " + LoanDateCalculator.calculate(24);

            String actual = loanCreator.execute("Sally", "Freedom", 40000, 24, 5.0);

            if (expected.equals(actual)) {
                testsPassed++;
                System.out.println("✅ verifyLoanWithLoanAmountAndTermPassedIn passed");
            } else {
                System.out.println("❌ verifyLoanWithLoanAmountAndTermPassedIn FAILED");
                System.out.println("Expected:\n" + expected);
                System.out.println("Actual:\n" + actual);
            }
            testsRun++;
        }

        // 4) verifyLoanWithLoanAmountAndInterestRatePassedIn
        {
            String expected = "The loan for: Denny Cool" + NEW_LINE +
                    "The loan amount is 40000" + NEW_LINE +
                    "The term is 36 years" + NEW_LINE +
                    "The interest rate is 4.3%" + NEW_LINE +
                    "The end date of the loan will be: " + LoanDateCalculator.calculate(36);

            String actual = loanCreator.execute("Denny", "Cool", 40000, 36, 4.3);

            if (expected.equals(actual)) {
                testsPassed++;
                System.out.println("✅ verifyLoanWithLoanAmountAndInterestRatePassedIn passed");
            } else {
                System.out.println("❌ verifyLoanWithLoanAmountAndInterestRatePassedIn FAILED");
                System.out.println("Expected:\n" + expected);
                System.out.println("Actual:\n" + actual);
            }
            testsRun++;
        }

        System.out.println();
        System.out.println("Tests passed: " + testsPassed + " / " + testsRun);
    }
}

