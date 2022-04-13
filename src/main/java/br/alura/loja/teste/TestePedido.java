package br.alura.loja.teste;

import br.alura.loja.pedido.acoes.EnviarEmailPedido;
import br.alura.loja.pedido.GeraPedido;
import br.alura.loja.pedido.GeraPedidoHandler;
import br.alura.loja.pedido.acoes.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestePedido {

    public static void main(String[] args) {
        String cliente = "Joana";
        BigDecimal valorOrcamento = new BigDecimal(100);
        int qtdItens = Integer.parseInt("2");

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcamento, qtdItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(
                Arrays.asList(new EnviarEmailPedido(),
                                new SalvarPedidoNoBanco())
        );
        geraPedidoHandler.executa(geraPedido);
    }
}
