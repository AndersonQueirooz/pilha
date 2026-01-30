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
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No pop() { // remove e retorna o nó do topo da pilha
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo(); // atualiza a referência para o próximo nó
            return noPoped; // retorna o nó removido
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "----------------\n";
        stringRetorno += "   Pilha\n";
        stringRetorno += "----------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }
        stringRetorno += "================\n";
        return stringRetorno;
    }
    
}