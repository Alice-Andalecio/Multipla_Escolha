package br.cefetmg.DAO.impl;

import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DB.Conexao;
import br.cefetmg.dominio.Usuario;
import br.cefetmg.exception.ExcecaoPersistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements IUsuarioDAO {//SQL

    @Override
    public void inserir(Usuario usuario) throws ExcecaoPersistencia {

        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "INSERT INTO usuario (nom_usuario, txt_Senha, cod_Email) VALUES(?,md5(?),?,?) RETURNING id";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getEmail());
            ResultSet rs = pstmt.executeQuery();

            Long id = null;
            if (rs.next()) {
                id = new Long(rs.getLong("idt_Perfil"));
                usuario.setId(id);
            }

            rs.close();
            pstmt.close();
            connection.close();

        } catch (Exception e) {
            throw new ExcecaoPersistencia(e.getMessage());
        }
    }

    @Override
    public Usuario consultar(long idUsuario) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE idt_Perfil = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, idUsuario);
            ResultSet rs = pstmt.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getLong("idt_Perfil"));
                usuario.setNome(rs.getString("nom_usuario"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setEmail(rs.getString("cod_Email"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }
    }

    @Override
    public boolean alterar(Usuario usuario) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "UPDATE usuario "
                    + "   SET nom_usuario = ?, "
                    + "       txt_Senha = md5(?), "
                    + "       cod_Email = ? "
                    + " WHERE idt_Perfil = ?;";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuario.getNome());
            pstmt.setString(2, usuario.getSenha());
            pstmt.setString(3, usuario.getEmail());
            pstmt.setLong(4, usuario.getId());
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
    public boolean excluir(Usuario usuario) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "DELETE FROM usuario WHERE idt_Perfil = ?";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setLong(1, usuario.getId());
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
    public List<Usuario> listar() throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "SELECT * FROM usuario ORDER BY nom_usuario";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            ArrayList<Usuario> listAll = null;
            if (rs.next()) {
                listAll = new ArrayList<>();
                do {
                    Usuario usuario = new Usuario();
                    usuario.setId(rs.getLong("idt_Perfil"));
                    usuario.setNome(rs.getString("nom_usuario"));
                    usuario.setSenha(rs.getString("txt_Senha"));
                    usuario.setEmail(rs.getString("cod_Email"));
                    listAll.add(usuario);
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

    @Override
    public Usuario consultarPorUsuarioSenha(String usuarioLogin, String senha) throws ExcecaoPersistencia {
        try {
            Connection connection = Conexao.getInstance().getConnection();

            String sql = "SELECT * FROM usuario WHERE nom_usuario = ? AND txt_Senha = md5(?)";

            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, usuarioLogin);
            pstmt.setString(2, senha);
            ResultSet rs = pstmt.executeQuery();

            Usuario usuario = null;
            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getLong("idt_Perfil"));
                usuario.setNome(rs.getString("nom_usuario"));
                usuario.setSenha(rs.getString("txt_Senha"));
                usuario.setEmail(rs.getString("cod_Email"));
            }

            rs.close();
            pstmt.close();
            connection.close();

            return usuario;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExcecaoPersistencia(e.getMessage());
        }
    }
}
