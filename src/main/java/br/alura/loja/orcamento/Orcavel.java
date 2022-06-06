package br.alura.loja.orcamento;

import java.math.BigDecimal;

public interface Orcavel {

    BigDecimal getValor();

    // Precisamos implementar uma forma de adicionar um orçamento a outro orçamento,
    // e escolhemos a abordagem de podermos representar tanto orçamentos quanto
    // itens de forma semelhante, através da interface Orcavel.

//    Ao implementar uma interface que permita representar ItemOrcamentos e Orcamentos de forma semelhante,
//    podemos percorrer essa lista de Orcavels facilmente, para calcular o valor do orçamento, que é a raiz da árvore.
}
