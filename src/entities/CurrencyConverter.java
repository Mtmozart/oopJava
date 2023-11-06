package entities;

public class CurrencyConverter {

	public static double valueDollar;
	public static double totalDollar;
	
	public static double IOF = 0.06;
	
	public static double conveter(){
		return 
				valueDollar * totalDollar * (1.0 + IOF); 
	}
}
