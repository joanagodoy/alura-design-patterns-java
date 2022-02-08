package br.alura.loja.imposto;

import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
