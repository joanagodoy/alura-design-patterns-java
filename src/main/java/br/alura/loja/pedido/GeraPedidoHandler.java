package br.alura.loja.pedido;

import br.alura.loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

//    construtor com injeção de dependencias, service, repository, etc

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        SalvarPedidoNoBanco salvar = new SalvarPedidoNoBanco();
        salvar.executar(pedido);

        EnviarEmailPedido email = new EnviarEmailPedido();
        email.executar(pedido);

    }

}
