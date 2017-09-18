package br.cefetmg.controller;

import br.cefetmg.DAO.IQuestaoDAO;
import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.QuestaoDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Questao;
import br.cefetmg.dominio.Usuario;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

public class ListarQuestao {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        try {
            IQuestaoDAO manterQuestao = new QuestaoDAO();
            List<Questao> listQuestao = manterQuestao.listar();
            if (listQuestao != null) {
                request.setAttribute("listUsuario", listQuestao);
                jsp = "/listarquestao.jsp";
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
