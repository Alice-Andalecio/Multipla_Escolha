package br.cefetmg.controller;

import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Usuario;
import javax.servlet.http.HttpServletRequest;

public class ExcluirUsuario {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        try {
            // lendo o CodUsuario que se deseja alterar
            Long usuarioId = Long.parseLong(request.getParameter("cod"));
            IUsuarioDAO manterUsuario = new UsuarioDAO();
            Usuario usuario = manterUsuario.consultar(usuarioId);
            boolean delete = manterUsuario.excluir(usuario);
            if (delete != false) {
                jsp = ListarUsuario.execute(request);
            } else {
                String erro = "Ocorreu erro ao Excluir Usuario!";
                request.setAttribute("erro", erro);
                jsp = "/erro.jsp";
            }
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
}
