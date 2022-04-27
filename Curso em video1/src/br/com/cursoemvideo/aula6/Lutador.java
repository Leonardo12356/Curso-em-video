package br.com.cursoemvideo.aula6;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	public void Apresentar() {
		System.out.println("----------------------------------------------------");
		System.out.println("CHEGOU A HORA!!! Apresentamos o lutador " + this.getNome());//this.nome também é correto.
		System.out.println("Diretamente da " + this.getNacionalidade());
		System.out.println("Com " + this.getIdade() + " anos e " + this.getAltura() + " de altura");
		System.out.println("pesando " + this.getPeso() + "Kg");
		System.out.println(this.getVitorias() + " vitórias");
		System.out.println(this.getDerrotas() + " derrotas e");
		System.out.println(this.getEmpates() + " empates!");
		
	}
	
	public void Status() {
		System.out.println(this.getPeso() + " é um peso " + this.getCategoria());
		System.out.println("Ganhou " + this.getVitorias() + " vezes");
		System.out.println("Perdeu " + this.getDerrotas() + " vezes");
		System.out.println("Empatou " + this.getEmpates() + " vezes");
	}
	
	public void GanharLuta() {
		this.setVitorias(this.getVitorias() + 1);
//		this.vitorias = this.vitorias + 1; // Outra forma de se fazer, também está correto.
	}
	
	public void PerderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	
	public void EmpatarLuta() {
		this.setEmpates(this.getEmpates() + 1);
	}
	
	

	public Lutador(String no, String na, int id, 
		float al, float pe,int vi, int de, int em) {
		super();
		this.nome = no;
		this.nacionalidade = na;
		this.idade = id;
		this.altura = al;
		this.setPeso(pe);
		this.vitorias = vi;
		this.derrotas = de;
		this.empates = em;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(peso <52.2) {
			this.categoria = "inválido";
		}else if (this.peso <= 70.3) {
			this.categoria = "Leve";
		}else if(this.peso <= 83.9) {
			this.categoria = "Médio";
		}else if(this.peso <= 120.2) {
			this.categoria = "Pesado";
		}else {
			this.categoria = "Inválido";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	
	
	
}
