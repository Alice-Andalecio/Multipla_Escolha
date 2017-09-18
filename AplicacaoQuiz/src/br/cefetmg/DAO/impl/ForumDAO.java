package br.cefetmg.DAO.impl;

import br.cefetmg.DB.Conexao;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ForumDAO implements br.cefetmg.DAO.ForumDAO {

    @Override
    public void inserir(long idQuestao, String comentario) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();
            String sql = "INSERT INTO Forum (cod_Questao,txt_Pergunta) VALUES (?,?)";
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, idQuestao);
            pstmt.setString(2, comentario);
            pstmt.close();
            connection.close();
        } catch (Exception e) {
            throw new ExcecaoPersistencia(e.getMessage());
        }

    }

    @Override
    public boolean editar(long idQuestao, long idComentario, String novoComentario) throws ExcecaoPersistencia {
       /* try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "UPDATE forum "
                    + "   SET cod_Questao = ?, "
                    + "       txt_Senha = md5(?), "
                    + "       cod_Email = ? "
                    + " WHERE idt_Perfil = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);

        } catch (Exception e) {
            throw new ExcecaoPersistencia(e.getMessage());
        }NAO SEI ONDE GUARDAR IDCOMENTARIO*/ 
        return true;
    }

    @Override
    public void excluir(long idQuestao, long idComentario) throws ExcecaoPersistencia {
        try {
            
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }
        //IDCOMENTARIO
    }

    @Override
    public void curtir(long idQuestao, long idComentario) throws ExcecaoPersistencia {
   //IDCOMENTARIO
    }

    @Override
    public String pesquisar(long idQuestao, String palavraChave) throws ExcecaoPersistencia {
    return ""; ///NAO TEM PALAVRA CHAVE NO BD
    }

}
