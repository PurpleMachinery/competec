package ocontrario;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		do {
			Metodo reverter = new Metodo(); //Criação do objeto reverter.
			String texto = entrada.nextLine();
			if (texto.length() < 2)
				return;
			for (int i = texto.length() - 1; i >= 0; i--) {
				reverter.SetTexto(texto, i); //Mandando a String e o numero da contagem para o método.
				System.out.print(reverter.GetTexto()); //Pega o Character para reverter a string até que vá para posição 0.
			}
			System.out.print("\n");
		} while (true != false);
	}
}
