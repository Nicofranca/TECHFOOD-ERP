package org.example.finance.impl;

import org.example.finance.MetodoPagamento;

public class Especie implements MetodoPagamento {
    @Override
    public boolean suporta(int opcao) {
        return false;
    }

    @Override
    public double calculaDesconto() {
        return 0;
    }
}
