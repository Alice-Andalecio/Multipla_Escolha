package br.cefetmg.exception;

public class ExcecaoPersistencia extends Exception {

    public ExcecaoPersistencia(String message) {
        super(message);
    }

    public ExcecaoPersistencia(Exception ex) {
        super(ex);
    }

}
