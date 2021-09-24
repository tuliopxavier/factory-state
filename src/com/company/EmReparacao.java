package com.company;

public class EmReparacao implements Estado{

    private Reparo reparo;

    public EmReparacao(Reparo reparo) {
        this.reparo = reparo;
    }

    @Override
    public void mudarEndereco(String novoEndereco) {
        System.out.println("Mudar endereço não é válido, vá para Envio");
    }

    @Override
    public void darOrcamento(double valor) {
        System.out.println("Para dar orçamento, volte para Orçamento");
    }

    @Override
    public void addItems(double valor) {
        double valorAtual = reparo.getValorEstimado();
        if (valor > 0) {
            reparo.setValorEstimado(valorAtual + valor);
        } else System.out.println("Insira um valor positivo");
    }

    @Override
    public void proxEstado() {
        reparo.setEstado(new ParaEnvio(reparo));
    }
}
