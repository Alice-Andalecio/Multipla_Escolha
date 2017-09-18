package br.cefetmg.dominio;

import java.util.Map;

public class Usuario extends Pessoa {

    private long idUsuario;
    private String email;
    private String senha;

    public Usuario() {
    }

    public Usuario(long idUsuario, String email, String senha, String nome, String apelido) {
        super(nome, apelido);
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(long idUsuario, String email, String senha) {
        this.idUsuario = idUsuario;
        this.email = email;
        this.senha = senha;
    }

    public Usuario(long id) {
        this.idUsuario = id;
    }

    public <K, V> Usuario(Map<K, V> atributos) {

        int nAtributos = this.getClass().getDeclaredFields().length - 1;

        for (int i = 0; i <= nAtributos; i++) {

            try {
                String nomeAtributo = this.getClass().getDeclaredFields()[i].getName();
                this.getClass().getDeclaredFields()[i].set(this, this.getClass().getDeclaredFields()[i].getType().cast(atributos.get(nomeAtributo)));
            } catch (IllegalArgumentException | IllegalAccessException ex) {
            }
        }
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return idUsuario;
    }

    public void setId(long id) {
        this.idUsuario = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
