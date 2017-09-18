/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.controller;

import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Usuario;
import javax.servlet.http.HttpServletRequest;
import br.cefetmg.servico.PersistenciaUsuarioDAO;
import br.cefetmg.servico.implementacaoUsuarioDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;
/**
 *
 * @author jaops
 */
public class Login {
    public static String execute (HttpServletRequest request){
        String jsp = "";
        try {
            System.err.println(request.getParameter("email"));
            String email = request.getParameter("email");
            String senha = request.getParameter("senha");
            
            IUsuarioDAO usuario = new UsuarioDAO();
            Usuario usr = usuario.consultarPorUsuarioSenha(email,senha);
            
            if(email.isEmpty()&&senha.isEmpty()){
               jsp = "/erro.jsp";
            } else {
                request.getSession().setAttribute("codUsuario", usr.getId());
                jsp = "/index.jsp";
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return jsp;
    }
    public static void validarSessao(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        Long codUsuario = (Long) request.getSession().getAttribute("codUsuario");
        String jsp = "";
        if (codUsuario == null) {
            jsp = "/index.jsp";
            //Redirecionando pagina
            RequestDispatcher rd = request.getRequestDispatcher(jsp);
            rd.forward(request, response);
        }
    }
}
