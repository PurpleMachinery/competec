package imc;

public class Metodo {
	double imc;

	double SetIMC(double peso, double altura) {
		imc = peso / (altura * altura);
		return imc;
	}
}