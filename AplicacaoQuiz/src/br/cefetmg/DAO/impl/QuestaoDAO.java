package br.cefetmg.DAO.impl;

import br.cefetmg.DB.Conexao;
import br.cefetmg.dominio.Questao;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class QuestaoDAO implements br.cefetmg.DAO.IQuestaoDAO {

    @Override
    public void inserir(Questao questao) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "INSERT INTO questao (cod_Questao, cod_Dominio, txt_Enunciado"
                    + ", idt_nivel_dificuldade, img_Enunciado, seq_Opcao_Correta) "
                    + "VALUES(?,?,?,?,?,?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, questao.getIdQuestao());
            pstmt.setString(2, questao.getDominio());
            pstmt.setString(3, questao.getEnunciado());
            pstmt.setString(4, questao.getNiveisDificuldade().get(questao.getNivelDificuldade()));
            pstmt.setString(5, questao.getPathImagens().get(0));
            for (int i = 0; i < questao.getAlternativas().size(); i++) {
                if (questao.getAlternativas().get(i).equals(true)) {
                    pstmt.setInt(6, i);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }
    }

    @Override
    public Questao consultar(long idQuestao) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "SELECT * FROM questao WHERE cod_Questao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, idQuestao);
            ResultSet rs = pstmt.executeQuery();

            Questao questao = null;
            if (rs.next()) {
                questao = new Questao();
                questao.setIdQuestao(rs.getLong("cod_Questao"));
                questao.setDominio(rs.getString("cod_Dominio"));
                questao.setEnunciado(rs.getString("txt_Enunciado"));
                questao.setNivelDificuldade(rs.getInt("idt_nivel_dificuldade"));
                ArrayList pathImagens = new ArrayList();
                pathImagens.add(rs.getString("img_Enunciado"));
                questao.setPathImagens(pathImagens);
            }

            rs.close();
            pstmt.close();
            connection.close();

            return questao;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }
    }

    @Override
    public boolean alterar(Questao questao) throws ExcecaoPersistencia {
        try {

            Connection connection = Conexao.getInstance().getConnection();

            String sql = "UPDATE questao "
                    + "   SET cod_Dominio = ?, "
                    + "       txt_Enunciado = ?, "
                    + "       idt_nivel_dificuldade = ?, "
                    + "       img_Enunciado = ? "
                    + " WHERE cod_Questao = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, questao.getDominio());
            pstmt.setString(2, questao.getEnunciado());
            pstmt.setInt(3, questao.getNivelDificuldade());
            pstmt.setString(4, questao.getPathImagens().get(0));
            pstmt.setLong(5, questao.getIdQuestao());
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }

    }

    @Override
    public boolean excluir(long idQuestao) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "DELETE FROM questao WHERE cod_Questao = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, idQuestao);
            pstmt.executeUpdate();

            pstmt.close();
            connection.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }
    }

    @Override
    public List<Questao> listar() throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "SELECT * FROM questao ORDER BY cod_Questao";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Questao> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Questao questao = new Questao();
                    questao.setIdQuestao(rs.getLong("cod_Questao"));
                    questao.setDominio(rs.getString("cod_Dominio"));
                    questao.setEnunciado(rs.getString("txt_Enunciado"));
                    questao.setNivelDificuldade(rs.getInt("idt_nivel_dificuldade"));
                    ArrayList path = new ArrayList();
                    path.add(rs.getString("img_Enunciado"));
                    questao.setPathImagens(path);
                    listAll.add(questao);
                } while (rs.next());
            }

            rs.close();
            pstmt.close();
            connection.close();

            return listAll;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }

    }

}
