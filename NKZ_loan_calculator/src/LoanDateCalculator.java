package edu.hfcc;

import java.time.LocalDate;

public class LoanDateCalculator {

      static LocalDate calculate(int term){
        LocalDate today = LocalDate.now();
        LocalDate endDate = today.plusMonths(term* 12L);
          System.out.println(endDate);
        return endDate;
    }
}
