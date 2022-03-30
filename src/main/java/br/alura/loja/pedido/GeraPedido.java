package br.alura.loja.pedido;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedido {
    public String cliente;
    public BigDecimal valorOrcamento;
    public int qtdItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    }

    public void executa(){
        Orcamento orcamento = new Orcamento(this.valorOrcamento, this.qtdItens);
        Pedido pedido = new Pedido(this.cliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
