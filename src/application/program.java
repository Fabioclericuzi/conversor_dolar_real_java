package application;

import java.util.Scanner;

import util.conversao;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o pre�o do dolar: ");
		double preco_dolar = sc.nextDouble();
		
		System.out.println("Qual a quantidade de dolar ser� comprada: ");
		double montante = sc.nextDouble();
		
		
		double resultado  = conversao.dolarParaReal(montante, preco_dolar);
		System.out.println("O valor total a ser pago em reais �: " + resultado);
		
		
		sc.close();
	}

}
