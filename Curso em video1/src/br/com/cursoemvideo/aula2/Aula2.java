package br.com.cursoemvideo.aula2;
/*se eu importar a aula 1 teria que colocar como publico 
 * métodos e atributos para que funcionasse neste pacote2 caneta*/
public class Aula2 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "BIC cristal";
		c1.cor = "Azul";
		c1.carga = 80;
		c1.tampada = true;
		c1.status();

	}

}
