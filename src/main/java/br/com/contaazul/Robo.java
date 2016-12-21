package br.com.contaazul;

public class Robo {

	public int x;
	public int y;
	public Orientacao orientacao = Orientacao.NORTH;
	
	
	public String mover(String movimentos){
		for (int i = 0; i < movimentos.length(); i++) {
			char acao = movimentos.charAt(i);
			if(acao == 'M') andar();
			mudarOrientacao(acao);
		}
		return String.format("(%d,%d,%s)", x,y,orientacao.getSigla());
	}
	
	public void andar(){
		if (this.orientacao.getOrientacao()==1) {
			moverNorte();
		}
	}
	
	private void mudarOrientacao(char movimento){
		if (movimento != 'L' && movimento != 'R') return;
		int posicao = 0;
		if(movimento == 'L'){
			posicao = orientacao.getOrientacao() - 1;
			posicao = (posicao < 1) ? 4 : posicao;
		} else if(movimento == 'R'){
			posicao = orientacao.getOrientacao() + 1;
			posicao = (posicao > 4) ? 1 : posicao;
		}
		
		this.orientacao = orientacao.getOrientacao(posicao);
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
