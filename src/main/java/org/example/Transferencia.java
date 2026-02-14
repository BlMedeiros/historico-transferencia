package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Transferencia {
    private int id;
    Conta conta_remetente;
    Conta conta_destinatario;

    List<Lancamento> transferencia;

    public Transferencia(int id, Conta conta_remetente, Conta conta_destinatario, List<Lancamento> transferencia) {
        this.id = id;
        this.conta_remetente = conta_remetente;
        this.conta_destinatario = conta_destinatario;
        this.transferencia = transferencia;
    }

    public BigDecimal calcularTotal(List<Lancamento> transferencia) {
        return transferencia.stream()
                .map(Lancamento::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
