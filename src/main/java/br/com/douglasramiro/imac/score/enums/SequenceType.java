package br.com.douglasramiro.imac.score.enums;

public enum SequenceType {

    KNOWN("Known"), UNKNOWN("unknown");

    private String type;

    SequenceType(String type) {
        this.type = type;
    }
}
