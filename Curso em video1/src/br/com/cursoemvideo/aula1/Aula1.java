package br.com.cursoemvideo.aula1;

public class Aula1 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.rabiscar();
		c1.status();
		
		Caneta c2 = new Caneta();
		c2.modelo = "Bic";
		c2.cor = "preta";
		c2.destampar();
		c2.status();
		c2.rabiscar();

	}

}
