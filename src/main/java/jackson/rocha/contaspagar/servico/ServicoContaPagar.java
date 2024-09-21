package jackson.rocha.contaspagar.servico;

import jackson.rocha.pagamento.DocumentoPagavel;
import jackson.rocha.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento) {

        metodoPagamento.pagar(documento);
    }
}
