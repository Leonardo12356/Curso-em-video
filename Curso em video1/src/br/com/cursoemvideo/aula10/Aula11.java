package br.com.cursoemvideo.aula10;

public class Aula11 {

	public static void main(String[] args) {
		// Animal n = new Animal(); não pode ser extanciado pois é uma classe abstrata
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru c = new Canguru();
		Cachorro k = new Cachorro();
		Cobra j = new Cobra();
		Tartaruga t = new Tartaruga();
		GoldFish g = new GoldFish();
		Arara e = new Arara();
		
		c.locomover();
		c.emitirSom();
		k.locomover();
		k.emitirSom();
		j.locomover();
		t.locomover();
		g.setPeso(500.3f);
		e.fazerNinho();
		
		m.setPeso(35.5f);
		m.setCorPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();
		r.locomover();
		
	}

}
