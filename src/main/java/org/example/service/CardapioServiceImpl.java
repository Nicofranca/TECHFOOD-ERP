package org.example.service;

import org.example.model.domain.Prato;
import org.example.model.service.CardapioService;

import java.util.List;

public class CardapioServiceImpl implements CardapioService {

    @Override
    public List<Prato> listarCardapio() {
        return List.of();
    }

    @Override
    public Prato novoPrato(int id, String nome, Double preco, int estoque) {
        return null;
    }
}
