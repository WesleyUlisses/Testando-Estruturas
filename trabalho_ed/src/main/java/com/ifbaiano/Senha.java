package com.ifbaiano;

public class Senha {
    
    private String senha;

    public Senha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String novaSenha) {
        this.senha = novaSenha;
    }

    public String toString() {
        return this.senha;
    }
}
