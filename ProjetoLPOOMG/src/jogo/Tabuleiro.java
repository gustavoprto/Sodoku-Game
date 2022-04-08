package jogo;

import java.util.Random;

public class Tabuleiro {
	// tabuleiro
	Random random = new Random(); // função random
	 
	private int linhas;
	private int colunas;
	
	
	public Tabuleiro(int linhas, int colunas) {
		this.linhas=linhas;
		this.colunas=colunas;	
	}
	
	private int[][] tabuleiro = new int[9][9]; // duvida ao professor, como deixar esse tabuleiro com a linha e coluna desejada
	
	public int[][] getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(int[][] tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	
	public void TabuleiroLimpo() {
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				tabuleiro[i][j] = 0;
			}
		}
	}
	
	public void randomTabuleiro() {
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				tabuleiro[i][j] = random.nextInt(9)+1;
				
				for(int erroLinha=0;erroLinha<j;erroLinha++) { // checkar se há numero igual na linha
					if(tabuleiro[i][erroLinha]==tabuleiro[i][j]) j--;
				} 
				
			}
			
			for(int j=0;j<colunas;j++) { //checkar se há numero igual na coluna
				for(int erroColuna=0;erroColuna<i;erroColuna++) {
					if(tabuleiro[erroColuna][j]==tabuleiro[i][j]) i--;
				}
			}
			
			//for(int linha_x= i-(i%3);linha_x<3)
			
			
		}
	}
	
	public void checkarTabuleiro() {
		randomTabuleiro();
		
	}
	
	public void mostrarTabuleiro() {
		TabuleiroLimpo();
		randomTabuleiro();
		for(int i=0;i<linhas;i++) {
			for(int j=0;j<colunas;j++) {
				System.out.print(tabuleiro[i][j]);
				
			}
			System.out.println();
		}
		
	}
}
			
		
		
		
		

	
	
	
	

