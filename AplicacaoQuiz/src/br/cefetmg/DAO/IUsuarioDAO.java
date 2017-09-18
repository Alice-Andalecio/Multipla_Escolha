package br.cefetmg.DAO;

import br.cefetmg.dominio.Usuario;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.List;

public interface IUsuarioDAO {
    public void inserir(Usuario obj) throws ExcecaoPersistencia;
    public Usuario consultar(long idUsuario) throws ExcecaoPersistencia;
    public boolean alterar(Usuario usuario) throws ExcecaoPersistencia;
    public boolean excluir(Usuario usuario) throws ExcecaoPersistencia;
    public List<Usuario> listar() throws ExcecaoPersistencia;
    public Usuario consultarPorUsuarioSenha(String usuario, String senha) throws ExcecaoPersistencia;
}