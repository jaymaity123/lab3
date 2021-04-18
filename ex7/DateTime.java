package ex7;
import java.time.*;
import java.util.*;

public class DateTime {  
   public static void main(String[] args)
    {
        LocalDate newdate = LocalDate.of(2012, 01, 01);
        LocalDate sys = LocalDate.now();
 
        Period diff = Period.between(newdate, sys);
 
     System.out.printf("\nDifference is %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
  }
}
