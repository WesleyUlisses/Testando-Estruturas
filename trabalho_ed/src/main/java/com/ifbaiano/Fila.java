package com.ifbaiano;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    
    private Queue<Lista> fila_de_senhas = new LinkedList<>();

    public void adiciona(Lista lista) {
        this.fila_de_senhas.add(lista);
    }

    public Queue<Lista> getFila_de_senhas() {
        return fila_de_senhas;
    }

}
