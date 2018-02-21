package br.com.douglasramiro.imac.score.exception;

import javax.ejb.EJBAccessException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.HashMap;
import java.util.Map;

@Provider
public class EJBAccessExceptionMapper implements ExceptionMapper<EJBAccessException> {

    @Override
    public Response toResponse(EJBAccessException ex) {
        String message = ex.getMessage();
        Map<String, String> map = new HashMap<>();
        map.put("message", message);
        return Response.status(Response.Status.FORBIDDEN).type(MediaType.APPLICATION_JSON).entity(map).build();

    }
}
