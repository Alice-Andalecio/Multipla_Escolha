package br.cefetmg.dominio;

import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class Questao {

    private Long idQuestao;
    private String enunciado;
    private Map<String, Boolean> alternativas;
    private ArrayList<String> pathImagens;
    private String tipoQuestao;
    private boolean visibilidade = true;
    private String dominio;
    private String modulo;
    private int nivelDificiculdade;
    private static Map<Integer,String> niveisDificuldade;


    public Questao() {
        
        niveisDificuldade = new LinkedHashMap<>();
        niveisDificuldade.put(1, "facil");
        niveisDificuldade.put(2, "moderado");
        niveisDificuldade.put(3, "dificil");
        niveisDificuldade.put(4, "desafio");
    }
    
    public Questao(String enunciado, Map<String, Boolean> alternativas, String tipoQuestao, String dominio, String modulo, Map<Integer,String> niveisDificuldade) throws ExcecaoPersistencia {

        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.tipoQuestao = tipoQuestao;
        this.dominio = dominio;
        this.modulo = modulo;
        this.niveisDificuldade = niveisDificuldade;
        validaAlternativas();
    }

    public <K, V> Questao(Map<K, V> atributos) {

        int nAtributos = this.getClass().getDeclaredFields().length - 1;

        for (int i = 0; i <= nAtributos; i++) {

            try {
                String nomeAtributo = this.getClass().getDeclaredFields()[i].getName();
                this.getClass().getDeclaredFields()[i].set(this, this.getClass().getDeclaredFields()[i].getType().cast(atributos.get(nomeAtributo)));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
            }
        }
    }
    
    public Questao(String enunciado, Map<String, Boolean> alternativas, String tipoQuestao, String dominio, String modulo, Map<Integer,String> niveisDificuldade, ArrayList<String> pathImagens) throws ExcecaoPersistencia {

        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.tipoQuestao = tipoQuestao;
        this.dominio = dominio;
        this.modulo = modulo;
        this.niveisDificuldade = niveisDificuldade;
        this.pathImagens = pathImagens;
        validaAlternativas();
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }
    

    public void validaAlternativas() throws ExcecaoPersistencia {
        if (!alternativas.isEmpty()) {
            if (!alternativas.values().contains(true)) {
                throw new ExcecaoPersistencia("Não há alternativa correta");
            }
            if (Collections.frequency(alternativas.values(), true) > 1) {
                throw new ExcecaoPersistencia("Há mais de uma alternativa correta");
            }
        }
    }



    public void mostrarAtributos() {
        int nAtributos = this.getClass().getDeclaredFields().length - 1;
        for (int i = 0; i <= nAtributos; i++) {
            String nomeAtributo = this.getClass().getDeclaredFields()[i].getName();
            try {
                System.out.println(nomeAtributo + " = " + this.getClass().getDeclaredFields()[i].get(this));
            } catch (SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            }
        }

    }

    public Long getIdQuestao() {
        return idQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public Map<String, Boolean> getAlternativas() {
        return alternativas;
    }

    public void setAlternativas(Map<String, Boolean> alternativas) throws ExcecaoPersistencia {
        this.alternativas = alternativas;
        validaAlternativas();
    }

    public ArrayList<String> getPathImagens() {
        return pathImagens;
    }

    public void setPathImagens(ArrayList<String> pathImagens) {
        this.pathImagens = pathImagens;
    }

    public String getTipoQuestao() {
        return tipoQuestao;
    }

    public void setTipoQuestao(String tipoQuestao) {
        this.tipoQuestao = tipoQuestao;
    }

    public void setIdQuestao(Long idQuestao) {
        this.idQuestao = idQuestao;
    }

    public boolean isVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(boolean visibilidade) {
        this.visibilidade = visibilidade;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    public int getNivelDificuldade() {
        return nivelDificiculdade;
    }

    public void setNivelDificuldade(int nivelDificiculdade) {
        this.nivelDificiculdade = nivelDificiculdade;
    }

    public Map<Integer, String> getNiveisDificuldade() {
        return niveisDificuldade;
    }

    public void setNiveisDificuldade(Map<Integer, String> niveisDificuldade) {
        this.niveisDificuldade = niveisDificuldade;
    }
}
