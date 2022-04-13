package br.alura.loja.pedido;

public class SalvarPedidoNoBanco implements AcoesPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvar pedido no banco de dados");
    }
}
