package br.cefetmg.dominio;

import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Sessao {

    private Usuario usuarioLogado;
    private Map<Questao, String> questoesRespondidas;
    private int numeroRespondidasVF;
    private int numeroRespondidasFechada;
    private int numeroAcertosVF;
    private int numeroAcertosFechada;
    private int limiteQuestoes;
    private int totalRespostas;
    private int acerto;
    private int desempenho;

    public Sessao(Usuario usuarioLogado) {
        acerto = numeroAcertosVF + numeroAcertosFechada;
        questoesRespondidas = new LinkedHashMap<>();
        this.usuarioLogado = usuarioLogado;
        if (usuarioLogado instanceof Anonimo) {
            limiteQuestoes = 10;
        }
    }

    private void contabilizaQuestaoRespondida(Questao questaoRespondida, String resposta) {
        questoesRespondidas.put(questaoRespondida, resposta);

        switch (questaoRespondida.getTipoQuestao()) {
            case "VF":
                char[] gabaritoSeparado = resposta.toCharArray();
                numeroRespondidasVF += gabaritoSeparado.length;
                boolean[] gabaritoBooleano = new boolean[gabaritoSeparado.length];
                for (int i = 0; i < gabaritoSeparado.length; i++) {
                    if (gabaritoSeparado[i] == 'V') {
                        gabaritoBooleano[i] = true;
                    } else {
                        gabaritoBooleano[i] = false;
                    }
                }
                ArrayList respostasCorretas = new ArrayList(questaoRespondida.getAlternativas().values());
                for (int i = 0; i < gabaritoBooleano.length; i++) {
                    if ((boolean) respostasCorretas.get(i) == gabaritoBooleano[i]) {
                        numeroAcertosVF++;
                    }
                }
                break;
            case "fechada":
                if (questaoRespondida.getAlternativas().get(resposta)) {
                    numeroAcertosFechada++;
                }
                numeroRespondidasFechada++;
                break;
        }
    }

    public void questaoRespondida(Questao questao, String resposta) throws ExcecaoNegocio, ExcecaoPersistencia {
        if (questao == null) {
            throw new ExcecaoPersistencia("Questao não pode ser null");
        }
        if (resposta.isEmpty()) {
            throw new ExcecaoPersistencia("Resposta não pode ser vazio");
        }
        if (questao.getTipoQuestao() == null) {
            throw new ExcecaoPersistencia("Tipo da Questao não pode ser null");
        }
        totalRespostas++;
        switch (questao.getTipoQuestao()) {
            case "VF":
                char[] respostaVF = resposta.toCharArray();
                for (int i = 0; i < respostaVF.length; i++) {
                    if (Character.toUpperCase(respostaVF[i]) != 'V' && Character.toUpperCase(respostaVF[i]) != 'F') {
                        throw new ExcecaoPersistencia("Padrao de Respostas Errado");
                    }
                }
                break;
            case "aberta":
                break;
            case "fechada":
                if (questao.getAlternativas() == null) {
                    throw new ExcecaoPersistencia("Não há alternativas");
                }
                if (!questao.getAlternativas().containsKey(resposta)) {
                    throw new ExcecaoPersistencia("A resposta não é uma das alternativas");
                }
                break;
            default:
                throw new ExcecaoPersistencia("Tipo de Questao Invalido");
        }
        if (usuarioLogado instanceof Anonimo) {
            if (totalRespostas <= limiteQuestoes) {
                contabilizaQuestaoRespondida(questao, resposta);
            } else {
                throw new ExcecaoNegocio("Limite de questoes para esse perfil de Usuario alcançado");

            }
        } else {
            contabilizaQuestaoRespondida(questao, resposta);

        }
    }

    public void geraDesempenho() throws ExcecaoNegocio {

        if (usuarioLogado instanceof Anonimo)
            throw new ExcecaoNegocio ("Usuario nao possui permissao para gerar "
                    + "desempenho");
        
        if (totalRespostas > 0) {
            desempenho = (acerto * 100) / totalRespostas;
        } else 
            desempenho = 0;
        
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public void setUsuarioLogado(Usuario usuarioLogado) {
        this.usuarioLogado = usuarioLogado;
    }

    public Map<Questao, String> getQuestoesRespondidas() {
        return questoesRespondidas;
    }

    public void setQuestoesRespondidas(Map<Questao, String> questoesRespondidas) {
        this.questoesRespondidas = questoesRespondidas;
    }

      public int getNumeroRespondidasVF() {
        return numeroRespondidasVF;
    }


    public int getNumeroRespondidasFechada() {
        return numeroRespondidasFechada;
    }


    public int getNumeroAcertosVF() {
        return numeroAcertosVF;
    }


    public int getNumeroAcertosFechada() {
        return numeroAcertosFechada;
    }


    public int getLimiteQuestoes() {
        return limiteQuestoes;
    }

    public int getTotalRespostas() {
        return totalRespostas;
    }

    public int getAcerto() {
        return acerto;
    }

    public int getDesempenho() {
        return desempenho;
    }
}
