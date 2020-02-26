package Log4j;

abstract class Calculate {
	protected double rate;  
    abstract void getRate();  

    public double calculateBill(double Sqrfoot){  
         return(Sqrfoot*rate);  
     }  
}
