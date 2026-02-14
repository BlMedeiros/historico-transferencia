package org.example;

import java.math.BigDecimal;

public class Lancamento {
    private int id;
    private BigDecimal valor;

    public Lancamento(int id, BigDecimal valor) {
        this.id = id;
        this.valor = valor;
    }

    public Lancamento(BigDecimal valor) {
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
