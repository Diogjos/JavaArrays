package hearthrates;

import java.util.Scanner;

public class HearthRatesTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		HearthRates hearth1 = new HearthRates("", "", 0 ,0 ,0,50,1.2);
		
		System.out.println("O imc é: " + hearth1.getImc());
	}

}
