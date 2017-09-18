package br.cefetmg.servico;

import br.cefetmg.dominio.Questao;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.List;
import br.cefetmg.DAO.IQuestaoDAO;

public class implementacaoQuestaoDAO implements IQuestaoDAO{
    private final IQuestaoDAO dao;
    
    public implementacaoQuestaoDAO(IQuestaoDAO dao){
        this.dao = dao;
    }
    @Override
    public void inserir(Questao obj) throws ExcecaoPersistencia {
        dao.inserir(obj);
    }

    @Override
    public Questao consultar(long id) throws ExcecaoPersistencia {
        return dao.consultar(id);
    }

    @Override
    public boolean alterar(Questao questao) throws ExcecaoPersistencia {
        return dao.alterar(questao);
    }

    @Override
    public boolean excluir(long id) throws ExcecaoPersistencia {
        return dao.excluir(id);
    }

    @Override
    public List<Questao> listar() throws ExcecaoPersistencia {
        return dao.listar();
    }

}
