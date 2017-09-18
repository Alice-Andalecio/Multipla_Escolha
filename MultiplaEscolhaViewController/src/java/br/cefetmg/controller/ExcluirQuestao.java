package br.cefetmg.controller;

import br.cefetmg.DAO.IQuestaoDAO;
import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.QuestaoDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Questao;
import br.cefetmg.dominio.Usuario;
import javax.servlet.http.HttpServletRequest;

public class ExcluirQuestao {

    public static String execute(HttpServletRequest request) {
        String jsp = "";
        try {
            // lendo o CodUsuario que se deseja alterar
            Long questaoId = Long.parseLong(request.getParameter("cod_Questao"));
            IQuestaoDAO manterQuestao = new QuestaoDAO();
            Questao questao = manterQuestao.consultar(questaoId);
            boolean delete = manterQuestao.excluir(questao.getIdQuestao());
            if (delete != false) {
                jsp = ListarQuestao.execute(request);
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
