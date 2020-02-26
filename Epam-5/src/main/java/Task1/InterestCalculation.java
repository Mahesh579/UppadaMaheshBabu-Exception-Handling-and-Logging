package Task1;

import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.Level;

public class InterestCalculation {

private static final Logger	LOGGER=Logger.getLogger(InterestCalculation.class.getName());
double IntrestMethod(String CalculationType,double Amount,double NoOfYears,double rateOfIntrest) {
        
        double SimpleIntrest,CompoundIntrest;
		if(CalculationType=="SimpleIntrest")
		{
         SimpleIntrest=(Amount * NoOfYears * rateOfIntrest)/100;
         return SimpleIntrest;
		}
		else if(CalculationType=="CompoundIntrest")
		{
         CompoundIntrest=Amount * Math.pow(1.0+rateOfIntrest/100.0,NoOfYears) - Amount;
         return CompoundIntrest;
		}
		else
			return 0.0;
	}

}
