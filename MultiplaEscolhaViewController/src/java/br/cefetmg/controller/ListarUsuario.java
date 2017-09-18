package br.cefetmg.controller;

import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Usuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class ListarUsuario {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        
        try {
            System.out.println("debugLU");
            IUsuarioDAO manterUsuario = new UsuarioDAO();
            List<Usuario> listUsuario = manterUsuario.listar();
            if (listUsuario != null) {
                request.setAttribute("listUsuario", listUsuario);
                jsp = "/perfil.jsp";
            } else {
                String erro = "Nao existe registro!";
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
