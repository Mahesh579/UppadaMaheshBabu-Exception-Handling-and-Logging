package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GetPlanFactory {
	private static final Logger LOGGER = LogManager.getLogger(GetPlanFactory. class);
	public static Calculate getPlan(String planType){  

      if(planType.equalsIgnoreCase("standard")) {  
             return new Standard();  
           }   
       else if(planType.equalsIgnoreCase("Abovestandard")){  
            return new Abovestandard();  
        }   
      else if(planType.equalsIgnoreCase("Highstandard")) {  
            return new Highstandard();  
      }
      else if(planType.equalsIgnoreCase("HighstandardFullautomatic")) {  
    	  return new HighstandardFullautomatic();
      }
  return null;  
}  
}