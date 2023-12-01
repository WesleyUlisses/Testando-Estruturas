package com.ifbaiano;

import java.util.LinkedList;
import java.util.List;

public class Lista <Senha>{
    
    private List<Senha> lista_de_senhas = new LinkedList<Senha>();

    public void adiciona(Senha senha) {
        this.lista_de_senhas.add(senha);
    }

    public void excluir(Senha senha) {
        this.lista_de_senhas.remove(senha);
    }
}
