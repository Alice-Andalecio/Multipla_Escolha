package br.cefetmg.servico;

import br.cefetmg.exception.ExcecaoNegocio;
import br.cefetmg.exception.ExcecaoPersistencia;

public interface PersistenciaForumDAO {
    public void inserirComentario(long idQuestao, String comentario) throws ExcecaoNegocio, ExcecaoPersistencia;
    public boolean editarComentario(long idQuestao, long idComentario, String novoComentario) throws ExcecaoNegocio, ExcecaoPersistencia;
    public void excluirComentario(long idQuestao, long idComentario) throws ExcecaoPersistencia;
    public void curtirComentario(long idQuestao, long idComentario) throws ExcecaoPersistencia;
    public String pesquisarComentario(long idQuestao, String palavraChave) throws ExcecaoPersistencia;
}
