package br.com.contaazul.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.contaazul.Ground;
import br.com.contaazul.Robot;


public class RobotTest {
	Ground ground = new Ground(5, 5);

	@Test
	public void movimentoComRotacoesParaDireita() {
		Robot robot = new Robot();
		String asnwer = null;
		try {
			asnwer = robot.move("MMRMMRMM", ground);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("(2,0,S)", asnwer);
	}

	@Test
	public void movimentoParaEsquerda() {
		Robot robot = new Robot();
		String asnwer = null;
		try {
			asnwer = robot.move("MML", ground);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("(0,2,W)", asnwer);
	}

	@Test(expected=Exception.class)
	public void comandoInvalido() throws Exception {
		Robot robot = new Robot();
		robot.move("AAA", ground);
	}

	@Test(expected=Exception.class)
	public void posicaoInvalida() throws Exception {
		Robot robot = new Robot();
		robot.move("MMMMMMMMMMMMMMMMMMMMMMMM", ground);
	}

	@Test
	public void voltaCompleta() {
		Robot robot = new Robot();
		String asnwer = null;
		try {
			asnwer = robot.move("MMMMRMMMMRMMMMRMMMMR", ground);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertEquals("(0,0,N)", asnwer);
	}

}
