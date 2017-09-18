package br.cefetmg.controller;

import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Usuario;
import javax.servlet.http.HttpServletRequest;

public class AlterarUsuario {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        try {
            // lendo a Sigla do Usuario que deseja alterar
            Long codUsuario = Long.parseLong(request.getParameter("CodUsuario"));
            IUsuarioDAO manterUsuario = new UsuarioDAO();
            Usuario usuario = manterUsuario.consultar(codUsuario);
            if (usuario != null) {
                request.setAttribute("usuario", usuario);
                jsp = "/alterarusuario.jsp";
            } else {
                String erro = "Ocorreu erro ao Alterar Usuario!";
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
