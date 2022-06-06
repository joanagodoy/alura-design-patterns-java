package br.alura.loja.teste;

import br.alura.loja.desconto.CalculadoraDescontos;
import br.alura.loja.imposto.CalculadoraImpostos;
import br.alura.loja.imposto.ISS;
import br.alura.loja.orcamento.ItemOrcamento;
import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args){
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem(new ItemOrcamento(new BigDecimal("500")));

        Orcamento segundo = new Orcamento();
        segundo.adicionarItem(new ItemOrcamento(new BigDecimal(1000)));

        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println(calculadoraDescontos.calcular(primeiro));
        System.out.println(calculadoraDescontos.calcular(segundo));
    }

}
