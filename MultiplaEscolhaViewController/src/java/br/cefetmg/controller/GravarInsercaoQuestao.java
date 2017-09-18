package br.cefetmg.controller;

import br.cefetmg.DAO.IQuestaoDAO;
import br.cefetmg.DAO.IUsuarioDAO;
import br.cefetmg.DAO.impl.QuestaoDAO;
import br.cefetmg.DAO.impl.UsuarioDAO;
import br.cefetmg.dominio.Questao;
import br.cefetmg.dominio.Usuario;
import br.cefetmg.exception.ExcecaoPersistencia;
import javax.servlet.http.HttpServletRequest;

public class GravarInsercaoQuestao {

    public static String execute(HttpServletRequest request) throws ExcecaoPersistencia {
        String jsp = "";
        try {
            long idQuestao = Long.parseLong(request.getParameter("idQuestao"));
            String codDominio = request.getParameter("dominio");
            String enunciado = request.getParameter("enunciado");
            int nivelDificuldade = Integer.parseInt(request.getParameter("nivelDificuldade"));
            
            Questao questao = new Questao();
            questao.setIdQuestao(idQuestao);
            questao.setDominio(codDominio);
            questao.setEnunciado(enunciado);
            questao.setNivelDificuldade(nivelDificuldade);
            
            request.setAttribute("idQuestao", idQuestao);
            request.setAttribute("dominio", codDominio);
            request.setAttribute("enunciado", enunciado);
            request.setAttribute("nivelDificuldade", nivelDificuldade);
            
            /*
            IQuestaoDAO manterQuestao = new QuestaoDAO();
            manterQuestao.inserir(questao);
            */
            //Revisar a classe ListarQuestao uma vez que talvez nao seja necessario o uso dela.
            // Integrar com o banco de dados.
                jsp = ListarQuestao.execute(request); // Esse fluxo pode não funcionar
             
            
        } catch (Exception e) {
            e.printStackTrace();
            jsp = "";
        }
        return jsp;
    }
}
