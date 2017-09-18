package br.cefetmg.dominio;

public class AdmConteudo extends Usuario {

    public AdmConteudo() {
    }

    public AdmConteudo(Long id, String email, String senha) {
        super(id, email, senha);
    }

    public AdmConteudo(long idUsuario, String email, String senha, String nome, String apelido) {
        super(idUsuario, email, senha, nome, apelido);
    }
}
