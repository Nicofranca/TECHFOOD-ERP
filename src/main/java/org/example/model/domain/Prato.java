package org.example.model.domain;

public class Prato {
    private int id;
    private String nome;
    private Double preco;
    private int esetoque;

    public Prato(int id, String nome, Double preco, int esetoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.esetoque = esetoque;
    }

    public Prato() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getEsetoque() {
        return esetoque;
    }

    public void setEsetoque(int esetoque) {
        this.esetoque = esetoque;
    }
}
