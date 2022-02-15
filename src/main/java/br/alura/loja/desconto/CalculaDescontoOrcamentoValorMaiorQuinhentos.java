package br.alura.loja.desconto;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculaDescontoOrcamentoValorMaiorQuinhentos extends Desconto{

    public CalculaDescontoOrcamentoValorMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    protected boolean deveAplicar(Orcamento orcamento) {
       return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
