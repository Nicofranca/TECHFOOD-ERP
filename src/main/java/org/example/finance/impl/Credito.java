package org.example.finance.impl;

import org.example.finance.strategy.MetodoPagamento;

public class Credito implements MetodoPagamento {


    @Override
    public boolean suporta(int opcao) {
        return opcao == 1;
    }

    @Override
    public double calculaDesconto(Double valorBase) {
        return valorBase * 1.05;
    }
}
