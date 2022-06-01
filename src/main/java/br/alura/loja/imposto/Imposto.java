package br.alura.loja.imposto;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valorOutroImposto = outro != null ? outro.realizarCalculo(orcamento) : BigDecimal.ZERO;
        return  valorImposto.add(valorOutroImposto);
    }
}
