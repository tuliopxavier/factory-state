package com.company;

public class Finalizado implements Estado {

    private Reparo reparo;

    public Finalizado(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco(String novoEndereco) {
        System.out.println("Mudar endereço não é válido, produto já enviado");
    }

    @Override
    public void darOrcamento(double valor) {
        System.out.println("Produto já finalizado");
    }

    @Override
    public void addItems(double valor) {
        System.out.println("Produto já finalizado");
    }

    @Override
    public void proxEstado() {
        System.out.println("Produto já finalizado");
    }

}
