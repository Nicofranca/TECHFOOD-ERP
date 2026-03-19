package org.example.finance;

public interface MetodoPagamento {

    boolean suporta(int opcao);

    double calculaDesconto();
}
