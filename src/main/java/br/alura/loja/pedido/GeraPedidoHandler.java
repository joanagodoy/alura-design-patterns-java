package br.alura.loja.pedido;

import br.alura.loja.orcamento.Orcamento;
import br.alura.loja.pedido.acoes.AcoesPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

//    construtor com injeção de dependencias, service, repository, etc
    private List<AcoesPedido> acoes;

    public GeraPedidoHandler(List<AcoesPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }

}
