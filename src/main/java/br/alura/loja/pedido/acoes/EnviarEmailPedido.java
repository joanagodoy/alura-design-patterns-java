package br.alura.loja.pedido.acoes;

import br.alura.loja.pedido.Pedido;
import br.alura.loja.pedido.acoes.AcoesPedido;

public class EnviarEmailPedido implements AcoesPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar email com dados do novo pedido");
    }
}
