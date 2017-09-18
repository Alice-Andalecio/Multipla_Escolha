package br.cefetmg.DAO;

import br.cefetmg.dominio.Questao;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.List;

public interface IQuestaoDAO {
    public void inserir(Questao obj) throws ExcecaoPersistencia;
    public Questao consultar(long idQuestao)  throws ExcecaoPersistencia;
    public boolean alterar(Questao questao)  throws ExcecaoPersistencia;
    public boolean excluir(long idQuestao)  throws ExcecaoPersistencia;
    public List<Questao> listar()  throws ExcecaoPersistencia;
}