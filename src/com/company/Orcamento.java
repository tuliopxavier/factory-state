package com.company;

public class Orcamento implements Estado {

    private Reparo reparo;

    public Orcamento(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco(String novoEndereco) {
        System.out.println("Mudar endereço não é válido, vá para Envio");
    }

    @Override
    public void darOrcamento(double valor) {
        reparo.setValorEstimado(valor);
    }

    @Override
    public void addItems(double valor) {
        System.out.println("Não é permitido adicionar items, vá para Reparação");
    }

    @Override
    public void proxEstado() {
        reparo.setEstado(new EmReparacao(reparo));
    }
}
