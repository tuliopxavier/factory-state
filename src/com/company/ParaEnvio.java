package com.company;

public class ParaEnvio implements Estado {

    private Reparo reparo;

    public ParaEnvio(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco(String novoEndereco) {
        if (novoEndereco.length() > 20) {
            reparo.setEnderecoEntrega(novoEndereco);
        } else System.out.println("Insira mais informações de endereço.");
    }

    @Override
    public void darOrcamento(double valor) {
        System.out.println("Para dar orçamento, volte para Orçamento.");
    }

    @Override
    public void addItems(double valor) {
        System.out.println("Não é permitido adicionar items, vá para Reparação.");
    }

    @Override
    public void proxEstado() {
        reparo.setEstado(new Finalizado(reparo));
    }

}
