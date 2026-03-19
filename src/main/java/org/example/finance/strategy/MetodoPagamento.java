package org.example.finance.strategy;

public interface MetodoPagamento {

    boolean suporta(int opcao);

    double calculaDesconto(Double valorBase);
}
