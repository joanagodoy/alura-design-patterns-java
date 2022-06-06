package br.alura.loja.teste;

import br.alura.loja.imposto.CalculadoraImpostos;
import br.alura.loja.imposto.ICMS;
import br.alura.loja.imposto.ISS;
import br.alura.loja.orcamento.ItemOrcamento;
import br.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {

    public static void main(String[] args){
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal(100)));
        CalculadoraImpostos calculadoraImpostos = new CalculadoraImpostos();
        System.out.println(calculadoraImpostos.calcular(orcamento, new ISS(new ICMS(null))));
    }

}
