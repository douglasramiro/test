package br.com.douglasramiro.imac.score.rest;

import br.com.douglasramiro.imac.score.bo.PilotBo;
import br.com.douglasramiro.imac.score.entity.Pilot;
import br.com.douglasramiro.imac.score.repository.ClassRepository;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//import io.swagger.annotations.Api;

@Path("/class")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Stateless
public class ClassEndpoint {

	@EJB
	private ClassRepository classRepository;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll()
	{

		return Response.ok(classRepository.listAll()).build();
	}







}