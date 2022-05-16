package util;

public class conversao {
	
	public static double IOF = 0.06;
	
	public static double dolarParaReal(double montante, double preco_dolar) {
		return montante * preco_dolar * (1.0 + IOF);
	}
	
}
