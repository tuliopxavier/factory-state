package com.company;

public class Main {

    public static void main(String[] args) {

        Reparo liquidificador = new Reparo();
        liquidificador.setNome("Liquidificador Oster 1400W preto");
        liquidificador.setValorEstimado(50.99);
        liquidificador.setEstado(new Orcamento(liquidificador));
        liquidificador.proxEstado();

        liquidificador.addItems(49.99);
        liquidificador.proxEstado();

        liquidificador.setEnderecoEntrega("Rua Nome Generico, n99, CEP 12345-678");
        liquidificador.proxEstado();

        System.out.println("Nome do produto: " + liquidificador.getNome());
        System.out.println("Valor: " + liquidificador.getValorEstimado());
        System.out.println("Endereço de entrega: " + liquidificador.getEnderecoEntrega());
        System.out.println("Estado atual: " + liquidificador.getEstado().getClass());

    }
}
