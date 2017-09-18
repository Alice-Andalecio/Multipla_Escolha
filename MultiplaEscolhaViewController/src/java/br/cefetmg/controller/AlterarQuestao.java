package br.cefetmg.controller;

import br.cefetmg.DAO.IQuestaoDAO;
import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.QuestaoDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Questao;
import br.cefetmg.dominio.Usuario;
import javax.servlet.http.HttpServletRequest;

public class AlterarQuestao {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        try {
            // lendo a Sigla do Usuario que deseja alterar
            Long codQuestao = Long.parseLong(request.getParameter("CodQuestao"));
            IQuestaoDAO manterQuestao = new QuestaoDAO();
            Questao questao = manterQuestao.consultar(codQuestao);
            if (questao != null) {
                request.setAttribute("usuario", questao);
                jsp = "/alteraquestao.jsp";
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
