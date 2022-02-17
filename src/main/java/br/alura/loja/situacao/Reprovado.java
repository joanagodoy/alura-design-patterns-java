package br.alura.loja.situacao;

import br.alura.loja.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
