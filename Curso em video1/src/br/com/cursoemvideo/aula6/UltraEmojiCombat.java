package br.com.cursoemvideo.aula6;

public class UltraEmojiCombat {

	public static void main(String[] args) {
		Lutador l[] = new Lutador[6]; // usando vetor.
		l[0] = new Lutador("Pretty Boy ", "Fran�a", 31, 1.75f,
				68.9f, 11, 2, 1);
		l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,
				57.8f, 14, 2, 3);
		l[2] = new Lutador("SnapShadow", "EUA", 35, 1.65f,
				81.6f, 12, 2, 1);
		l[3] = new Lutador("Dead Code", "Austr�lia", 28, 1.93f,
				81.6f, 13, 0, 2);
				
		l[4] = new Lutador("UFOCobol", "Brasil", 37, 1.78f,
				81.6f, 5, 4, 3);
				
		l[5] = new Lutador("Nerdaart", "EUA", 30, 1.81f,
				105.7f, 12, 2, 4);
		
		
//		l[3].PerderLuta();
		l[3].GanharLuta();
		l[3].Status();
		
		//		Lutador l = new Lutador("Pretty Boy ", "Fran�a", 31, 1.75f,
//				68.9f, 11, 2, 1);// forma simples por�m mais demorada.
		


	}

}
