package com.company;

public interface Estado {

    public void mudarEndereco(String novoEndereco);

    public void darOrcamento(double valor);

    public void addItems(double valor);

    public void proxEstado();
}