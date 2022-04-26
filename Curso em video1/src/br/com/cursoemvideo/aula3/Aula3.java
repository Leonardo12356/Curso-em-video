package br.com.cursoemvideo.aula3;
/*Estudando Getters e Setters*/
public class Aula3 {

	public static void main(String[] args) {

		Caneta c1 = new Caneta("BIC", "Amarela", 0.4f);
//		c1.setModelo("BIC");
//		//c1.modelo = "BIC";
//		
//		c1.setPonta(0.5f);
//		//c1.ponta = 0.5f;
//		
		c1.status();
//		
//		System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta "
//				 + c1.getPonta());
		Caneta c2 = new Caneta("DEATH", "Laranja", 1.0f);
		c2.status();
	}

}
