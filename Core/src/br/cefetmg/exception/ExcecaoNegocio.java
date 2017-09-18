package br.cefetmg.exception;

public class ExcecaoNegocio extends Exception {

    public ExcecaoNegocio(String message) {
        super(message);
    }

    public ExcecaoNegocio(Exception ex) {
        super(ex);
    }

}
