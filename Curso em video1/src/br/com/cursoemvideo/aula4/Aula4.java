package br.com.cursoemvideo.aula4;

public class Aula4 {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Léo");
		p1.abrirConta("CC");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Thamyris");
		p2.abrirConta("CP");
		p2.depositar(500);
		p2.sacar(1000);
		
		p1.estadoAtual();
		p2.estadoAtual();
		
		
		ContaBanco p3 = new ContaBanco();
		p3.setNumConta(4444);
		p3.setDono("Fulano");
		p3.abrirConta("CP");
		p3.fecharConta();
		p3.sacar(150);
		p3.fecharConta();
		p3.estadoAtual();
		
	}

}
