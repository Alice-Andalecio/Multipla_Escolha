package br.cefetmg.dominio;

public class Anonimo extends Usuario {

    public Anonimo() {
    }

    public Anonimo(Long id, String email, String senha) {
        super(id, email, senha);
    }

    public Anonimo(long idUsuario, String email, String senha, String nome, String apelido) {
        super(idUsuario, email, senha, nome, apelido);
    }

}
