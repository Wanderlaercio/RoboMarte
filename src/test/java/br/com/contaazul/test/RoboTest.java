package br.com.contaazul.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.contaazul.Robo;


public class RoboTest {

		
	@Test
	public void movimentoParaEsquerda(){
		Robo robo = new Robo();
		String saida = robo.mover("MM");
		Assert.assertEquals("(0,2,N)", saida);
	}
}
