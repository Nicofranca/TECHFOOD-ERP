package org.example.finance.impl;

import org.example.finance.strategy.MetodoPagamento;

public class Pix implements MetodoPagamento {
    @Override
    public boolean suporta(int opcao) {
        return opcao == 3;
    }

    @Override
    public double calculaDesconto(Double valorBase) {
        return valorBase*0.90;
    }
}
