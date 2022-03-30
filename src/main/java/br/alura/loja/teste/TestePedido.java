package br.alura.loja.teste;

import br.alura.loja.orcamento.Orcamento;
import br.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestePedido {

    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int qtdItens = Integer.parseInt(args[2]);

        Orcamento orcamento = new Orcamento(valorOrcamento, qtdItens);
        Pedido pedido = new Pedido(cliente, LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no banco de dados");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
