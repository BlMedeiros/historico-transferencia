package org.example;

import java.util.Stack;

public class Saldo {
    private int id;
    Stack<Lancamento> lancamentos;

    public Saldo(int id, Stack<Lancamento> lancamentos) {
        this.id = id;
        this.lancamentos = lancamentos;
    }

    public Saldo(Stack<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }
}
