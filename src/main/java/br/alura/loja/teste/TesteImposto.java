package br.alura.loja.teste;

import br.alura.loja.imposto.CalculadoraImpostos;
import br.alura.loja.imposto.ISS;
import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento(new BigDecimal(100), 1);
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        System.out.println(calculadoraImpostos.calcular(orcamento, new ISS()));
    }

}
