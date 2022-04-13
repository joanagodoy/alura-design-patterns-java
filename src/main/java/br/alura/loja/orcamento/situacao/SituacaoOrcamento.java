package br.alura.loja.orcamento.situacao;

import br.alura.loja.DomainException;
import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento)  {
        throw new DomainException("Não é possível aprovar!");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Não é possível reprovar!");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Não é possível finalizar!");
    }
}
