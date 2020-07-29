package util;

public class CurrencyConvert {
	
	public static double IOF = 0.06;

	public static double dollarToReal(double total, double precoDoDolar) {
		return total * precoDoDolar * (1.0 + IOF);

	}
}
