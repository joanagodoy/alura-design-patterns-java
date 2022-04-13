package br.alura.loja.pedido;

public class EnviarEmailPedido implements AcoesPedido{

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviar email com dados do novo pedido");
    }
}
