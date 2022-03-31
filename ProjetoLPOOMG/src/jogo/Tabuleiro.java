package jogo;

import java.util.Random;

public class Tabuleiro {
	// tabuleiro
	Random random = new Random(); // função random
	
	private int[][] tabuleiro = new int[9][9]; // primeiro eh as celulas, depois as casas da celula
	
	public void randomTabuleiro() {
		for(int c = 0; c < 2; c++) {
			for (int n = 0; n < 9; n++) {
				
				tabuleiro[c][n] = random.nextInt(9)+1;
				
				for(int nMatriz=0 ; nMatriz<n ; nMatriz++) { // verificar numeros repetidos na celula
					
					if(tabuleiro[c][nMatriz] == tabuleiro[c][n]) {
						n--;
						break;
						
					}
				
				}
				/*if(c<3) {
					if (n<3) {
						for(int cLinha=0; cLinha<=c; cLinha++) {
							for(int nLinha=0; nLinha<3; nLinha++) {
								if(tabuleiro[cLinha][nLinha] == tabuleiro[c][n]) {
									
									break;
									}
								}
							if(tabuleiro[cLinha][nLinha] == tabuleiro[c][n]) {
								
								break;
								}
							}}} */				
			}
			
			
			/*for (int i = 0; i < 9; i++) { // testando se sai certo
				System.out.println(tabuleiro[0][i]);
				
			}
			System.out.println("");
			for (int i = 0; i < 9; i++) { // testando se sai certo
				System.out.println(tabuleiro[1][i]);
				
			}*/
		}
	}
}
			
		
		
		
		

	
	
	
	

