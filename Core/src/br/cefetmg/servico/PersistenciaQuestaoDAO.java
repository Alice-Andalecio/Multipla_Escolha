package br.cefetmg.servico;

import br.cefetmg.dominio.Questao;
import java.util.List;

public interface PersistenciaQuestaoDAO {
    public void inserirQuestao(Questao obj);
    public Questao consultarQuestao(long id);
    public boolean alterarQuestao(long idObjetoAntigo, Questao novoObj);
    public Questao excluirQuestao(long id);
    public List<Questao> listarQuestao();
}
