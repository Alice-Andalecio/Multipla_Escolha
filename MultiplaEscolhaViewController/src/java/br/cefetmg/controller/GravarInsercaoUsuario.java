package br.cefetmg.controller;

import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Usuario;
import br.cefetmg.exception.ExcecaoPersistencia;
import javax.servlet.http.HttpServletRequest;

public class GravarInsercaoUsuario {

    public static String execute(HttpServletRequest request) throws ExcecaoPersistencia {
        String jsp = "";
        try {
            String nome = request.getParameter("name");
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            String tipoUsuario = request.getParameter("tipoUsuario");
            String apelido = request.getParameter("username");
            
            request.setAttribute("name", nome);
            request.setAttribute("email", email);
            request.setAttribute("senha", senha);
            request.setAttribute("tipoUsuario", tipoUsuario);
            request.setAttribute("apelido", apelido);

            Usuario usuario = new Usuario();
            usuario.setNome(nome);
            usuario.setEmail(email);
            usuario.setSenha(senha);
            usuario.setApelido(apelido);
            
            System.out.println(nome);
            //BD NAO TA PRONTO ISSO CAUSA ERRO.
            /*    IUsuarioDAO manterUsuario = new UsuarioDAO();
            manterUsuario.inserir(usuario);
            
             */
            if (tipoUsuario.equals("Administrador")) { // tem que puxar o usuario do BD também
                jsp = "/perfilAdm.jsp";
            } else {
                jsp = "/perfil.jsp";
            }

        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
}
