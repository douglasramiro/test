package br.com.douglasramiro.imac.score.enums;

public class ExceptionType {

    private String code;
    private String message;

    public static final ExceptionType PILOT_ALREADY_REGISTERED = getInstance("00001","Piloto já registrado");

    private ExceptionType(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ExceptionType getInstance(String codigo, String msg){
        return new ExceptionType(codigo, msg);
    }


    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
