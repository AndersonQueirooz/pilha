package com.pilha;

public class No {

    private int dado;
    private No reNo = null;

    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReNo() {
        return reNo;
    }

    public void setReNo(No reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() { // método para representar o nó como uma string
        return "No [dado=" + dado + "]";
    }
}