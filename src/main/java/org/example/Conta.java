package org.example;

import java.math.BigDecimal;
import java.util.Stack;

public class Conta {
    private int id;
    private Saldo saldo;


    public Conta(int id, Saldo saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Conta(Saldo saldo) {
        this.saldo = saldo;
    }
}
