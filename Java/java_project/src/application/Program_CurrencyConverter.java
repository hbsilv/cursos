package application;

import java.util.Scanner;
import util.CurrencyConverter;

public class Program_CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is the dollar price? ");
		double cotacao = sc.nextDouble();
		System.out.println("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		double real = CurrencyConverter.convert(dollar,cotacao);
		
		System.out.println(String.format("%.2f", real));
		
		
		sc.close();
	}

}
