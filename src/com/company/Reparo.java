package com.company;

public class Reparo {

    private String nome;
    private double valorEstimado;
    private String enderecoEntrega;
    private Estado estado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void mudarEndereco(String novoEndereco){
        this.estado.mudarEndereco(novoEndereco);
    };

    public void darOrcamento(double valor){
        this.estado.darOrcamento(valor);
    };

    public void addItems(double valor){
        this.estado.addItems(valor);
    };

    public void proxEstado(){
        this.estado.proxEstado();
    };

}
