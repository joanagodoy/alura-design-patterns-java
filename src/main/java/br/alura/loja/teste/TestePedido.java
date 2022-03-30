package br.alura.loja.teste;

import br.alura.loja.orcamento.Orcamento;
import br.alura.loja.pedido.GeraPedido;
import br.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qtdItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, qtdItens);
        geraPedido.executa();
    }
}
