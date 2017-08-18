package imc;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		Metodo calc = new Metodo();
		double imc[] = new double[2];
		double peso, altura;
		while(true!=false) {
			for (int i = 0; i < 2; i++) {
				peso = entrada.nextDouble();
				altura = entrada.nextDouble();
				if (peso == 0 || altura == 0)
					return;
				imc[i] = calc.SetIMC(peso, altura);
			}
			if (imc[0] < imc[1]) {
				System.out.println(
						"Voce precisa se esforçar mais, seu IMC anterior era de: " + imc[0] + " e o atual e " + imc[1]);
			} else {
				System.out.println("Parabens, seu IMC anterior era: " + imc[0] + " e o atual e " + imc[1]);
			}
		}
	}
}