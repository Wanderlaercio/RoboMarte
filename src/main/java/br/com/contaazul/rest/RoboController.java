package br.com.contaazul.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.contaazul.Robo;

@Path("/{path: (R|L|M)*}")
public class RoboController {
	
	@GET
	@Produces("text/plain")
	public String movimentarRobo(@PathParam("path") final String movimentos) {
		Robo robo = new Robo();
		return robo.mover(movimentos);
	}
}
