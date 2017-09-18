package br.cefetmg.DAO;

import br.cefetmg.exception.ExcecaoPersistencia;

public interface ForumDAO {
    public void inserir(long idQuestao, String comentario) throws ExcecaoPersistencia;
    public boolean editar(long idQuestao, long idComentario, String novoComentario) throws ExcecaoPersistencia;
    public void excluir(long idQuestao, long idComentario) throws ExcecaoPersistencia;
    public void curtir(long idQuestao, long idComentario) throws ExcecaoPersistencia;
    public String pesquisar(long idQuestao, String palavraChave) throws ExcecaoPersistencia;
}