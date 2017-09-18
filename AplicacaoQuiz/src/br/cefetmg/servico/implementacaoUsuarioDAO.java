package br.cefetmg.servico;

import br.cefetmg.dominio.Usuario;
import java.util.List;
import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.exception.ExcecaoPersistencia;

public class implementacaoUsuarioDAO implements IUsuarioDAO{
    private final IUsuarioDAO dao;
    public implementacaoUsuarioDAO(){
        dao = new UsuarioDAO();
    }
    public implementacaoUsuarioDAO(IUsuarioDAO dao){
        this.dao = dao;
    }
    @Override
    public void inserir(Usuario obj)  throws ExcecaoPersistencia{
        dao.inserir(obj);
    }

    @Override
    public Usuario consultar(long id)  throws ExcecaoPersistencia{
        return dao.consultar(id);
    }

    @Override
    public boolean alterar(Usuario usuario)  throws ExcecaoPersistencia{
        return dao.alterar(usuario);
    }

    @Override
    public boolean excluir(Usuario usuario)  throws ExcecaoPersistencia{
        return dao.excluir(usuario);
    }

    @Override
    public List<Usuario> listar()  throws ExcecaoPersistencia{
        return dao.listar();
    }
    
    @Override
    public Usuario consultarPorUsuarioSenha(String usuario, String senha) throws ExcecaoPersistencia{
        return dao.consultarPorUsuarioSenha(usuario, senha);
    }
}
