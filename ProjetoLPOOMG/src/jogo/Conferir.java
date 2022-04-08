package jogo;

public class Conferir {
	
	private int x;
	private int y;
	
	public Conferir(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Tabuleiro teste = new Tabuleiro(9,9);
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	//public boolean checkLinha(int x, int y) {
		//for(int j = 0; j<9; j++) {
			//if(teste.setTabuleiro([x][y])) return true;
		//}
		
	//}
	
	
}
