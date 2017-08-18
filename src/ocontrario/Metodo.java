package ocontrario;

public class Metodo {
	char letra;
	void SetTexto(String texto, int x){
		letra=texto.charAt(x);
	}
	char GetTexto() {
		return letra;
	}
}
