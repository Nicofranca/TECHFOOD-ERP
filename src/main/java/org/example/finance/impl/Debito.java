package org.example.finance.impl;

import org.example.finance.strategy.MetodoPagamento;

public class Debito implements MetodoPagamento {
    @Override
    public boolean suporta(int opcao) {
        return opcao == 2;
    }

    @Override
    public double calculaDesconto(Double valorBase) {
        return 0.8;
    }
}
