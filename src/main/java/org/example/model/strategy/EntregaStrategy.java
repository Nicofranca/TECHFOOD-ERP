package org.example.model.strategy;

public interface EntregaStrategy {
    boolean suporta(int opcao);

    double taxa(Double valorBase, int km);
}
