package br.com.douglasramiro.imac.score.exception;

import br.com.douglasramiro.imac.score.enums.ExceptionType;

import javax.validation.ConstraintViolation;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;
import java.util.*;

@Provider
public class ScoreExceptionMapper implements ExceptionMapper<ScoreException> {

    @Override
    public Response toResponse(ScoreException ex) {
        ex.printStackTrace();
        if (ex.getExceptions() != null && !ex.getExceptions().isEmpty()){
            Map<String,List<ExceptionType>> map = new HashMap<>();
            map.put("messages", ex.getExceptions());
            return Response.status(Response.Status.BAD_REQUEST).type(MediaType.APPLICATION_JSON).entity(map).build();
        }else if (ex.getViolations() != null && ex.getViolations().size() > 0){
            Map<String,List<ExceptionType>> map = new HashMap<>();
            map.put("messages", getMessages(ex.getViolations()));
            return Response.status(Response.Status.BAD_REQUEST).type(MediaType.APPLICATION_JSON).entity(map).build();
        }else{
            String message = ex.getMessage();
            Map<String,String> map = new HashMap<>();
            map.put("message", message);
            return Response.status(Response.Status.BAD_REQUEST).type(MediaType.APPLICATION_JSON).entity(map).build();

        }
    }

    private List<ExceptionType> getMessages(Set<ConstraintViolation<Object>> violations) {
        List<ExceptionType> erros = new ArrayList<>();
        for (ConstraintViolation<Object> violacao : violations) {
            erros.add(ExceptionType.getInstance("10230", violacao.getMessage()));

        }
        return erros;

    }
}
