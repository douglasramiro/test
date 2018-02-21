package br.com.douglasramiro.imac.score.exception;

import br.com.douglasramiro.imac.score.enums.ExceptionType;

import javax.validation.ConstraintViolation;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ScoreException extends Exception{


    private List<ExceptionType> exceptions;
    private Set<ConstraintViolation<Object>> violations;

    public ScoreException(ExceptionType type){
        super(type.getMessage());
        exceptions = new ArrayList<>();
        exceptions.add(type);
    }

    public ScoreException(List<ExceptionType> exceptions){
        this.exceptions = exceptions;
    }

    public List<ExceptionType> getExceptions() {
        return exceptions;
    }

    public Set<ConstraintViolation<Object>> getViolations() {
        return violations;
    }

    public void setViolations(Set<ConstraintViolation<Object>> violations) {
        this.violations = violations;
    }
}
