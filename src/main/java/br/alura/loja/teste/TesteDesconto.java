package br.alura.loja.teste;

import br.alura.loja.desconto.CalculadoraDescontos;
import br.alura.loja.imposto.CalculadoraImpostos;
import br.alura.loja.imposto.ISS;
import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDesconto {

    public static void main(String[] args){
        Orcamento primeiro = new Orcamento(new BigDecimal(100), 6);
        Orcamento segundo = new Orcamento(new BigDecimal(1000), 1);
        CalculadoraDescontos calculadoraDescontos = new CalculadoraDescontos();
        System.out.println(calculadoraDescontos.calcular(primeiro));
        System.out.println(calculadoraDescontos.calcular(segundo));
    }

}
