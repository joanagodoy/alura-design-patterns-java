package br.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {
    public String cliente;
    public BigDecimal valorOrcamento;
    public int qtdItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }
}
