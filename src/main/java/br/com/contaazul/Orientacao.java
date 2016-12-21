package br.com.contaazul;

public enum Orientacao {

	  NORTH(1,"N"),
	  EAST(2,"E"),
	  SOUTH(3,"S"),
	  WEST(4,"W");
	  
	
	   private int orientacao;
	   private String	sigla;
	  
	  Orientacao(int orientacao,String sigla){
	   this.orientacao = orientacao;
	   this.sigla=sigla;
	  }

	   public int getOrientacao(){
	   return this.orientacao;

	  }
	   
	public Orientacao getOrientacao(int i) {
		for (Orientacao o : Orientacao.values()) {
			if (o.getOrientacao() == i) {
				return o;
			}
		}
		
		return null;

	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public void setOrientacao(int orientacao) {
		this.orientacao = orientacao;
	}
	   
	   
}
