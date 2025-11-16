import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoanCreatorTest {

    private static final String NEW_LINE = System.lineSeparator();

    private LoanCreator loanCreator;

    @BeforeEach
    public void setup() {
        loanCreator = new LoanCreator();
    }

    @Test
    public void verifyLoanWithAllParametersPassedIn() {
        String expected = "The loan for: Fred Wasup" + NEW_LINE +
                "The loan amount is 20000" + NEW_LINE +
                "The term is 60 years" + NEW_LINE +
                "The interest rate is 6.5%" + NEW_LINE +
                "The end date of the loan will be: " + LoanDateCalculator.calculate(60);

        String actual = loanCreator.execute("Fred", "Wasup", 20000, 60, 6.5);

        assertEquals(expected, actual);
    }

    @Test
    public void verifyLoanWithLoanAmountPassedIn() {
        String expected = "The loan for: John Doe" + NEW_LINE +
                "The loan amount is 40000" + NEW_LINE +
                "The term is 36 years" + NEW_LINE +
                "The interest rate is 5.0%" + NEW_LINE +
                "The end date of the loan will be: " + LoanDateCalculator.calculate(36);

        String actual = loanCreator.execute("John", "Doe", 40000, 36, 5.0);

        assertEquals(expected, actual);
    }

    @Test
    public void verifyLoanWithLoanAmountAndTermPassedIn() {
        String expected = "The loan for: Sally Freedom" + NEW_LINE +
                "The loan amount is 40000" + NEW_LINE +
                "The term is 24 years" + NEW_LINE +
                "The interest rate is 5.0%" + NEW_LINE +
                "The end date of the loan will be: " + LoanDateCalculator.calculate(24);

        String actual = loanCreator.execute("Sally", "Freedom", 40000, 24, 5.0);

        assertEquals(expected, actual);
    }

    @Test
    public void verifyLoanWithLoanAmountAndInterestRatePassedIn() {
        String expected = "The loan for: Denny Cool" + NEW_LINE +
                "The loan amount is 40000" + NEW_LINE +
                "The term is 36 years" + NEW_LINE +
                "The interest rate is 4.3%" + NEW_LINE +
                "The end date of the loan will be: " + LoanDateCalculator.calculate(36);

        String actual = loanCreator.execute("Denny", "Cool", 40000, 36, 4.3);

        assertEquals(expected, actual);
    }
}
