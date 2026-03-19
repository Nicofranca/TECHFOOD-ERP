package org.example.model.strategy;

public class EntregaDeliveryImpl implements EntregaStrategy{

    double taxaEntrega = 1.40;

    @Override
    public boolean suporta(int opcao) {
        return opcao == 2;
    }

    @Override
    public double taxa(Double valorBase, int km) {

        //Se a quilometragem não se encaixar em nenhuma condicao, o frete é gratis

        if (km < 10){
            return valorBase*taxaEntrega;
        } else if (km > 10 && km < 20) {
            return valorBase*(taxaEntrega+0.20);
        } else if (km > 20 && km < 35) {
            return valorBase*(taxaEntrega+0.50);
        }

        return valorBase;
    }
}
