package br.com.contaazul;

public class Robo {

	public int x;
	public int y;
	public String orientacao = "N";
	
	
	public String mover(String movimentos){
		for (int i = 0; i < movimentos.length(); i++) {
			char acao = movimentos.charAt(i);
			andar();
		}
		return String.format("(%d,%d,%s)", x,y,orientacao);
	}
	
	public void andar(){
		if (this.orientacao.equals("N")) {
			moverNorte();
		}
	}
	
	private void moverEsquerda(){
		x--;
	}
	
	private void moverDireita(){
		x++;
	}
	
	private void moverNorte(){
		y++;
	}
	
	private void moverSul(){
		y--;
	}
}
