package br.cefetmg.dominio;

public class Aluno extends Usuario {

    public Aluno() {}
    
    public Aluno(Long id, String email, String senha){
        super(id,email,senha);
    }

    public Aluno(long idUsuario, String email, String senha, String nome, String apelido) {
        super(idUsuario, email, senha, nome, apelido);
    }

}
