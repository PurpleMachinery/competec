package ocontrario;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);

		do {
			Metodo reverter = new Metodo();
			String texto = entrada.nextLine();
			if (texto.length() < 2)
				return;
			for (int i = texto.length() - 1; i >= 0; i--) {
				reverter.SetTexto(texto, i);
				System.out.print(reverter.GetTexto());
			}
			System.out.print("\n");
		} while (true != false);
	}
}
