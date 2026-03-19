package org.example.model.service;

import org.example.model.domain.Prato;

import java.util.List;

public interface CardapioService {
    List<Prato> listarCardapio();
    Prato novoPrato(int id, String nome, Double preco, int estoque);
}
