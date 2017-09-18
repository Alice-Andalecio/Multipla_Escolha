/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cefetmg.dominio;

import br.cefetmg.exception.ExcecaoPersistencia;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import br.cefetmg.dominio.Usuario;
import br.cefetmg.exception.ExcecaoNegocio;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GVGX_TECNOLOGIA
 */
public class SessaoTest {

    public SessaoTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    
    @Test 
    public void testGeraDesempenho () throws ExcecaoPersistencia, ExcecaoNegocio  {
        Sessao sessao = new Sessao(new Anonimo ());
        Map<String, Boolean> alternativasTeste = new LinkedHashMap<>();
        alternativasTeste.put("op1", false);
        alternativasTeste.put("op2", false);
        alternativasTeste.put("op3", false);
        alternativasTeste.put("op4", true);
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        questao.setTipoQuestao("fechada");
        questao.setAlternativas(alternativasTeste);
        String resposta = "op4";
        sessao.questaoRespondida(questao, resposta);
        try  {
            sessao.geraDesempenho();
        }catch (ExcecaoNegocio e){
            return;
        }
        fail ("Aceitou todos os usuarios");
    }
    
    @Test
    public void testQuestaoRespondida() throws Exception {
        System.out.println("questaoRespondida");
        Questao questao = null;
        String resposta = "VFVFVFFVFVF";
        Sessao instance = new Sessao(new Usuario());
        try {
            instance.questaoRespondida(questao, resposta);
        } catch (ExcecaoPersistencia e) {
            return;
        }
        fail("A função aceitou null como questao");
    }

    @Test
    public void testQuestaoRespondida2() throws Exception {
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        String resposta = "";
        Sessao instance = new Sessao(new Usuario());
        try {
            instance.questaoRespondida(questao, resposta);
        } catch (ExcecaoPersistencia e) {
            return;
        }
        fail("A função aceitou vazio como resposta");
    }

    @Test
    public void testQuestaoRespondida3() throws Exception {
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        String resposta = "VVF";
        Sessao instance = new Sessao(new Usuario());
        try {
            instance.questaoRespondida(questao, resposta);
        } catch (ExcecaoPersistencia e) {
            return;
        }
        fail("A função aceitou questao sem tipo");
    }

    @Test
    public void testQuestaoRespondida4() throws Exception {
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        questao.setTipoQuestao("VF");
        String resposta = "VVFG";
        Sessao instance = new Sessao(new Usuario());
        try {
            instance.questaoRespondida(questao, resposta);
        } catch (ExcecaoPersistencia e) {
            return;
        }

        fail("A função aceitou resposta de questao V ou F sem ser V ou F");
    }

    @Test
    public void testQuestaoRespondida5() throws Exception {
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        questao.setTipoQuestao("VFG");
        String resposta = "VVF";
        Sessao instance = new Sessao(new Usuario());
        try {
            instance.questaoRespondida(questao, resposta);
        } catch (ExcecaoPersistencia e) {
            return;
        }

        fail("A função aceitou um tipo inválido para Questao");
    }

    @Test
    public void testQuestaoRespondida6() throws Exception {
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        questao.setTipoQuestao("fechada");
        String resposta = "teste";
        Sessao instance = new Sessao(new Usuario());
        try {
            instance.questaoRespondida(questao, resposta);
        } catch (ExcecaoPersistencia e) {
            return;
        }

        fail("A função aceitou uma resposta de questao fechada, sem ter as alternativas");
    }

    @Test
    public void testQuestaoRespondida7() throws Exception {
        Map<String, Boolean> alternativasTeste = new LinkedHashMap<>();
        alternativasTeste.put("op1", false);
        alternativasTeste.put("op2", false);
        alternativasTeste.put("op3", false);
        alternativasTeste.put("op4", true);
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        questao.setTipoQuestao("fechada");
        questao.setAlternativas(alternativasTeste);
        String resposta = "teste";
        Sessao instance = new Sessao(new Usuario());
        try {
            instance.questaoRespondida(questao, resposta);
        } catch (ExcecaoPersistencia e) {
            return;
        }

        fail("A função aceitou uma resposta de questao fechada que não é uma alternativa");
    }

    @Test
    public void testQuestaoRespondida8() throws Exception {
        Map<String, Boolean> alternativasTeste = new LinkedHashMap<>();
        alternativasTeste.put("op1", false);
        alternativasTeste.put("op2", false);
        alternativasTeste.put("op3", false);
        alternativasTeste.put("op4", false);
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        questao.setTipoQuestao("fechada");
        try {
            questao.setAlternativas(alternativasTeste);
        } catch (ExcecaoPersistencia e) {
            return;
        }

        fail("A função aceitou uma questao sem alternativa correta");
    }

    @Test
    public void testQuestaoRespondida9() throws Exception {
        Map<String, Boolean> alternativasTeste = new LinkedHashMap<>();
        alternativasTeste.put("op1", false);
        alternativasTeste.put("op2", false);
        alternativasTeste.put("op3", true);
        alternativasTeste.put("op4", true);
        System.out.println("questaoRespondida");
        Questao questao = new Questao();
        questao.setTipoQuestao("fechada");
        try {
            questao.setAlternativas(alternativasTeste);
        } catch (ExcecaoPersistencia e) {
            return;
        }

        fail("A função aceitou uma questao com mais de uma alternativa correta");
    }
@Test
    public void testQuestaoRespondida10() throws Exception {
        System.out.println("setUsuarioLogado");
        Anonimo anonimo = new Anonimo();
        try {
            Map<String, Boolean> alternativasTeste = new LinkedHashMap<>();
            alternativasTeste.put("op1", false);
            alternativasTeste.put("op2", false);
            alternativasTeste.put("op3", false);
            alternativasTeste.put("op4", true);
            System.out.println("questaoRespondida");
            Questao questao = new Questao();
            questao.setTipoQuestao("fechada");
            questao.setAlternativas(alternativasTeste);
            Sessao instance = new Sessao(anonimo);
            for (int i = 0; i < 12; i++) {
                String resposta = "op1";
                instance.questaoRespondida(questao, resposta);
            }

        } catch (ExcecaoNegocio e) {
            return;
        }
        fail("O limite de usuario nao logado nao esta sendo respeitado");
    }

 

}
