package br.com.contaazul.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.contaazul.Robo;


public class RoboTest {

	@Test
	public void movimentoParaEsquerda(){
		Robo robo = new Robo();
		String saida = robo.mover("MML");
		Assert.assertEquals("(0,2,W)", saida);
	}
	
	@Test
	public void movimentoParaEsquerda2(){
		Robo robo = new Robo();
		String saida = robo.mover("MML");
		Assert.assertEquals("(0,2,W)", saida);
	}
	
	@Test
	public void movimentoComRotacoesParaDireita(){
		Robo robo = new Robo();
		String saida = robo.mover("MMRMMRMM");
		Assert.assertEquals("(2,0,S)", saida);
	}
}

