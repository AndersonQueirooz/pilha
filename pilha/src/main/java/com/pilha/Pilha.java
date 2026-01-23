package com.pilha;

public class Pilha {

    private No refNoEntradaPilha; // referência para o nó de entrada da pilha

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public boolean isEmpty() { // verifica se a pilha está vazia
        return refNoEntradaPilha == null ? true : false;
    }

    public No top() { // retorna o nó do topo da pilha sem removê-lo
        return refNoEntradaPilha;
    }

    public void push(No novoNo) { // adiciona um novo nó ao topo da pilha
        No refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setReNo(refAuxiliar);
    }
}