package org.example.model.strategy;

public class EntregaPresencialImpl implements EntregaStrategy{

    double desconto = 0.1;

    @Override
    public boolean suporta(int opcao) {
        return opcao == 1;
    }

    @Override
    public double taxa(Double valorBase, int km) {
        //se o cliente for retirar, ganha um desconto
        return valorBase*desconto;
    }
}
