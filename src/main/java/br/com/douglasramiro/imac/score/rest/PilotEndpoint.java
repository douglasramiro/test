package br.com.douglasramiro.imac.score.rest;

import br.com.douglasramiro.imac.score.bo.PilotBo;
import br.com.douglasramiro.imac.score.entity.Pilot;
import br.com.douglasramiro.imac.score.util.Constantes;
import org.jboss.ejb3.annotation.SecurityDomain;
//import io.swagger.annotations.Api;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pilot")
//@Api(value = "/pilot", description = "Pilot", tags = "pilot")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
@SecurityDomain(Constantes.SECURITY_DOMAIN)
public class PilotEndpoint {

	@EJB
	private PilotBo pilotBo;

	@GET
	@PermitAll
	public Response listAll(){
		return Response.ok(pilotBo.listAll()).build();
	}

	@POST
	@RolesAllowed("admin")
	public Response save(Pilot pilot){
		pilot = pilotBo.save(pilot);
		System.out.println(pilot);
		return Response.ok().entity(pilot).build();
	}






}