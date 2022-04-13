package br.alura.loja.orcamento;

import br.alura.loja.DomainException;
import br.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){
        //Chamada HTTP para Api externa
        //URL Connection
        //HttpCliente
        //libRest
        if(orcamento.isFinalizado()){
            throw new DomainException("Orcamento nao finalizado");
        }

        String url = "http://api.externa/orcamento";
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeItens()
        );
        http.post(url, dados);
    }
}
