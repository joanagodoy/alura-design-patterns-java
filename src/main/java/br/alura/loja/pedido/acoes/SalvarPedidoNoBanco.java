package br.alura.loja.pedido.acoes;

import br.alura.loja.pedido.Pedido;
import br.alura.loja.pedido.acoes.AcoesPedido;

public class SalvarPedidoNoBanco implements AcoesPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no banco de dados");
    }
}
