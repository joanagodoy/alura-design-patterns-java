package br.alura.loja.teste;

import br.alura.loja.http.JavaHttpClient;
import br.alura.loja.orcamento.Orcamento;
import br.alura.loja.orcamento.RegistroDeOrcamento;

import java.math.BigDecimal;

public class TesteAdapter {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.aprovar();
        orcamento.finalizar();

        RegistroDeOrcamento registro = new RegistroDeOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
