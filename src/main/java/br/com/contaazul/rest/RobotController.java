package br.com.contaazul.rest;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.contaazul.Ground;
import br.com.contaazul.Robot;

@Path("/{path: ([A-Z])+}")
public class RobotController {

	@POST
	@Produces("text/plain")
	public Response moveRobot(@PathParam("path") final String movements) {
		Ground ground = new Ground(5,5);
		Robot robot = new Robot();
		try {
			return Response.ok(robot.move(movements,ground)).build();
		} catch (Exception e) {
			return Response.status(400).entity("400 Bad Request").build();
		}
	}
}
