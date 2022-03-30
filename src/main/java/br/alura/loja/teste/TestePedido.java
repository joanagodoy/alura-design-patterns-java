package br.alura.loja.teste;

import br.alura.loja.pedido.GeraPedido;
import br.alura.loja.pedido.GeraPedidoHandler;

import java.math.BigDecimal;

public class TestePedido {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qtdItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, qtdItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler();
        geraPedidoHandler.executa(geraPedido);
    }
}
