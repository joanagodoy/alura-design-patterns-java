package br.alura.loja.desconto;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDescontos {

    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new CalculaDescontoOrcamentoMaisCincoItens(
                new CalculaDescontoOrcamentoValorMaiorQuinhentos(
                    new SemDesconto()
                ));
        return desconto.calcular(orcamento);
    }
}
